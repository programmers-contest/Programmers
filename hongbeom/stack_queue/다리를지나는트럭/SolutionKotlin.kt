package stack_queue.다리를지나는트럭

import java.util.*

class SolutionKotlin {

    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val waitingTruck: Queue<Int> = LinkedList(truck_weights.toList())
        val bridgeContinueTruck: Queue<Int> = LinkedList(List(bridge_length){0})

        while (bridgeContinueTruck.isNotEmpty()) {
            bridgeContinueTruck.poll()
            answer++
            if(waitingTruck.isNotEmpty()) {
                if (weight >= bridgeContinueTruck.sum() + waitingTruck.peek()) {
                    bridgeContinueTruck.add(waitingTruck.poll())
                } else {
                    bridgeContinueTruck.add(0)
                }
            }
        }
        return answer
    }

}