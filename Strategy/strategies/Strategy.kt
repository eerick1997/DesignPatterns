package strategies

import BattleState

interface Strategy {
    fun execute(battleState: BattleState)
}