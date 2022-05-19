package factory

import enemy.Boo
import enemy.Entity
import enemy.Koopa

class RandomDifficultEnemyFactory: EnemyFactory() {
    override fun createEnemy(): Entity {
        val randomVal = Math.random()
        return if (randomVal > 0.5) {
            Koopa()
        } else {
            Boo()
        }
    }
}