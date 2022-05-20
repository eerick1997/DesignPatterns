import strategies.DirectDamageStrategy
import strategies.RainStrategy

fun main(args: Array<String>) {
    val battleState = BattleState(1000, BattleState.WEATHER.SUNNY)
    val otherBattleState = BattleState(1200, BattleState.WEATHER.CLOUDY)
    val rainStrategy = RainStrategy()
    val directDamageStrategy = DirectDamageStrategy()
    rainStrategy.execute(battleState)
    directDamageStrategy.execute(battleState)

    rainStrategy.execute(otherBattleState)
    rainStrategy.execute(otherBattleState)
}