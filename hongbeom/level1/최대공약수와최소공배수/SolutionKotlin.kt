package level1.최대공약수와최소공배수

class SolutionKotlin {

    fun solution(n: Int, m: Int): IntArray {
        val gcd = getGreatestCommonDivisor(n, m)
        return intArrayOf(getGreatestCommonDivisor(n, m), getLeastCommonMultiple(n, m, gcd))
    }

    private tailrec fun getGreatestCommonDivisor(a: Int, b: Int): Int =
            if (b == 0) a
            else getGreatestCommonDivisor(b, a % b)

    private fun getLeastCommonMultiple(a: Int, b: Int, greatestCommonDivisor: Int) = (a * b) / greatestCommonDivisor

}