package level1.`수박수박수박수박수박수?`

class Solution {

    fun solution(n: Int): String {
        var answer = ""
        for (i in 0 until n) {
            answer += if (i % 2 == 1) "박" else "수"
        }
        return answer
    }

}