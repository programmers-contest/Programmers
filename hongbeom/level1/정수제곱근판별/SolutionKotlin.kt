package level1.정수제곱근판별

import kotlin.math.sqrt

class SolutionKotlin {

    fun solution(n: Long) = sqrt(n.toDouble()).toLong()
            .takeIf { it * it == n }
            ?.let { (it + 1) * (it + 1) } ?: -1

}