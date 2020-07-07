package level1.핸드폰번호가리기

class SolutionKotlin {

    fun solution(phone_number: String) = phone_number.mapIndexed { index, c ->
        if (index < phone_number.length - 4) "*" else c
    }.joinToString("")

}