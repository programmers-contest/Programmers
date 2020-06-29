package kakao_blind_recruitment_2019.크레인인형뽑기게임

import java.util.*

class Solution {

    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var count = 0
        val basket = Stack<Int>()

        moves.forEach label@{ move ->
            board.forEach { floor ->
                if (floor[move - 1] != 0) {
                    if (basket.isNotEmpty() && basket.peek() == floor[move - 1]) {
                        count += 1
                        basket.apply {
                            push(floor[move - 1])
                            pop()
                            pop()
                        }
                    } else {
                        basket.push(floor[move - 1])
                    }
                    floor[move - 1] = 0
                    return@label
                }
            }
        }

        return count
    }

}