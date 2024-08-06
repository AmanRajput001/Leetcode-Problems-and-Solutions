class Solution {
    public int minimumPushes(String word) {
        // Step 1: Count the frequency of each letter
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Create a max heap (priority queue) for frequencies
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : frequencyMap.values()) {
            maxHeap.add(freq);
        }
        
        // Step 3: Calculate the total number of key presses
        int totalPresses = 0;
        int keyPosition = 0;
        
        while (!maxHeap.isEmpty()) {
            int freq = maxHeap.poll();
            int pressCount = (keyPosition / 8) + 1;
            totalPresses += freq * pressCount;
            keyPosition++;
        }
        
        return totalPresses;
    }

}