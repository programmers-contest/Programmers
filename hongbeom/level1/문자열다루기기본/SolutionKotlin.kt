package level1.문자열다루기기본

class SolutionKotlin {

    fun solution(s: String) =
            s.all { it.isDigit() } && ((s.length == 4) || (s.length == 6))

}