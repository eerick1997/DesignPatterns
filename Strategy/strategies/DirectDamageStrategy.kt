package strategies

import BattleState

class DirectDamageStrategy : Strategy {
    override fun execute(battleState: BattleState) {
        battleState.HealthPoints -= (Math.random() * 10).toInt()
        println("DirectDamageStrategy executed!")
    }
}