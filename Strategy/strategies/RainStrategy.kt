package strategies

import BattleState

class RainStrategy : Strategy {
    override fun execute(battleState: BattleState) {
        val randDamage: Int = (Math.random() * 10).toInt()
        if (randDamage > 5) {
            battleState.weather = BattleState.WEATHER.RAIN
            println("Rain start!")
        }
        battleState.HealthPoints -= randDamage * 10
        println("RainStrategy executed!")
    }
}