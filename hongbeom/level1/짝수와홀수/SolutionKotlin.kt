package level1.짝수와홀수

class SolutionKotlin {

    fun solution(num: Int) = num.takeIf { it % 2 == 0 }?.let { "Even" } ?: "Odd"

}