package level1.콜라츠추측

class SolutionKotlin {

    fun solution(num: Int) = collatzConjecture(num.toLong(), 0)

    private tailrec fun collatzConjecture(number: Long, count: Int): Int =
            when {
                count > 500 -> -1
                number == 1L -> count
                else -> collatzConjecture(
                        if (number % 2 == 0L) number / 2 else (number * 3) + 1,
                        count + 1
                )
            }

}