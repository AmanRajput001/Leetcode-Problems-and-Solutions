/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    arr.filter((n) =>  n > 10 )
    arr.filter((n, i) =>  i === 0 )
    arr.filter((n, i) =>  n + i)

    return arr.filter(fn)
};