import java.util.regex.Pattern;

class Solution {
    public boolean isNumber(String s) {
        // Define the regular expression pattern for a valid number
        String pattern = "[-+]?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)([eE][-+]?[0-9]+)?";
        
        // Compile the pattern
        Pattern p = Pattern.compile(pattern);
        
        // Check if the string matches the pattern
        return p.matcher(s.trim()).matches();
    }
}
