package level1.가운데글자가져오기

class SolutionKotlin {

    fun solution(s: String): String {
        val length = s.length

        return s.takeIf {
            length % 2 == 1
        }?.let {
            it[(length / 2)].toString()
        } ?: s.substring((length / 2) - 1, (length / 2) + 1)
    }

}