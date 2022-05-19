data class BattleState(var HealthPoints: Int, var weather: WEATHER) {
    enum class WEATHER {
        RAIN,
        FOGGY,
        SUNNY,
        CLOUDY,
        SNOWING
    }
}
