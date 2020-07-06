package level1.평균구하기

class SolutionKotlin {

    // 느림
    fun solution(arr: IntArray) = arr.average()

    // 훨씬 빠른 계산
    fun solutionFaster(arr: IntArray): Double {
        var sum = 0.0
        arr.forEach {
            sum += it
        }
        return sum / arr.size
    }

}