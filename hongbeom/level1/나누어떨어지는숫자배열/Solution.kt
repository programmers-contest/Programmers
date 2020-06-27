package level1.나누어떨어지는숫자배열

class Solution {

    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = arr.toTypedArray().filter { it % divisor == 0 }.sorted().toIntArray()
        return if (answer.isNotEmpty()) {
            answer
        } else {
            intArrayOf(-1)
        }
    }


}