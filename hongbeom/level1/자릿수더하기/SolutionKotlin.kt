package level1.자릿수더하기

class SolutionKotlin {

    fun solution(n: Int) = n.toString().map { it.toString().toInt() }.sum()

}