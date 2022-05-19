import enemy.Entity
import factory.EnemyFactory

class Game(private val enemyFactory: EnemyFactory){
    private var entities = mutableListOf<Entity>()

    fun processGameLogic() {
        for (entity in entities) {
            entity.updateLogic()
        }
    }

    fun gameLogic() {
        if (shouldSpawnEnemy()) {
            for (i in 0 until 10) {
                entities.add(enemyFactory.createEnemy())
            }
        }
    }

    private fun shouldSpawnEnemy(): Boolean {
        return true
    }
}