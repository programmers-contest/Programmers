package level1.자릿수더하기

class Solution {

    fun solution(n: Int) = n.toString().map { it.toString().toInt() }.sum()

}