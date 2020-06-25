package level1.문자열내마음대로정렬하기

class Solution {

    fun solution(strings: Array<String>, n: Int) =
            strings.also {
                it.sort()
                it.sortBy {
                    it[n]
                }
            }

}