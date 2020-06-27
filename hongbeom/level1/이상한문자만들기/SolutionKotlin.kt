package level1.이상한문자만들기

class SolutionKotlin {

    fun solution(s: String) = s.split(" ")
            .joinToString(" ") {
                it.mapIndexed { index, c ->
                    if (index % 2 == 0) c.toUpperCase()
                    else c.toLowerCase()
                }.joinToString("")
            }

}
