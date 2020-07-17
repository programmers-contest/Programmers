package level1.제일작은수제거하기

class KotlinSolution {

    fun solution(arr: IntArray): IntArray {
        val minValue = arr.min()
        return arr.filter { it != minValue }.takeIf { it.isNotEmpty() }?.toIntArray() ?: IntArray(1) { -1 }
    }

}