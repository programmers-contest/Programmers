package level1.x만큼간격이있는n개의숫자

class SolutionKotlin {

    fun solution(x: Int, n: Int) = LongArray(n) { x.toLong() * (it + 1) }

}