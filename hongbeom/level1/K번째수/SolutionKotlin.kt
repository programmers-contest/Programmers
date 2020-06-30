package level1.K번째수

class SolutionKotlin {

    fun solution(array: IntArray, commands: Array<IntArray>) =
            commands.map { command ->
                        array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1] }
                    .toIntArray()
}