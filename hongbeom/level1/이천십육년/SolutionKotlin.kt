package level1.이천십육년

class SolutionKotlin {

    fun solution(a: Int, b: Int): String {
        val week = listOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        val month = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var count = 0

        for (i in 0 until a - 1) {
            count += month[i]
        }

        count = (count + b - 1) % 7

        return week[count]
    }

}