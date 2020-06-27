package level1.자연수뒤집어배열로만들기

class SolutionKotlin {

    fun solution(n: Long) = n.toString()
            .reversed()
            .map { it.toString().toInt() }
            .toIntArray()

}