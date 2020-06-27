package level1.시저암호

class SolutionKotlin {

    fun solution(s: String, n: Int) = s.map {
        when (it) {
            in ('a'..'z') -> 'a' + ((it - 'a' + n) % 26)
            in ('A'..'Z') -> 'A' + ((it - 'A' + n) % 26)
            else -> it
        }
    }.joinToString("")

}