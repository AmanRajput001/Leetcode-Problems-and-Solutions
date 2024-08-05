/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
        arr.map((n)=>{return n + 1}),
        arr.map((n, i)=>{return n + i}),
        arr.map(()=>{return 42})
    return arr.map(fn);
};