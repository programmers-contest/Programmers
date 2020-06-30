package level1.약수의합

class SolutionKotlin {

    fun solution(n: Int) = (1..n).filter { n % it == 0 }.sum()

}