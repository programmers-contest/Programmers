package kakao_blind_recruitment_2018.실패율

class SolutionKotlin {

    fun solution(N: Int, stages: IntArray) = (1..N)
            .map {
                val failedPersons = stages.count { stage -> it == stage }
                val passedPersons = stages.count { stage -> it <= stage }
                val failureRate = if (passedPersons == 0) 0f else failedPersons.toFloat() / passedPersons.toFloat()
                Pair(it, failureRate)
            }
            .sortedBy { it.first }
            .sortedByDescending { it.second }
            .map { it.first }
            .toIntArray()

}