package level1.하샤드수

class KotlinSolution {

    fun solution(x: Int) = x.toString().toCharArray().fold(0) { acc, c ->
        acc + c.toString().toInt()
    }.run { x % this == 0 }

}