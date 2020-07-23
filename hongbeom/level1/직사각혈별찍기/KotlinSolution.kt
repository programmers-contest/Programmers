package level1.직사각혈별찍기

class KotlinSolution {

    fun solution() {
        readLine()?.split(" ")?.map(String::toInt)?.let {
            val str = buildString {
                for (j in 1..it[0]) { append("*") }
            }
            for (i in 1..it[1]) { println(str) }
        }
    }

}