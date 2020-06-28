package level1.문자열내림차순으로배치하기

class Solution {

    fun solution(s: String) =
            s.toCharArray().sortedArrayDescending().joinToString()

}