package level1.정수내림차순으로배치하기

class Solution {

    fun solution(n: Long) = n.toString()
            .map { it.toString().toInt() }
            .sortedDescending()
            .joinToString("")
            .toLong()

}