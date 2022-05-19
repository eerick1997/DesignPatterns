package factory

import enemy.Boo
import enemy.Entity
import enemy.Goomba
import enemy.Koopa

class RandomEnemyFactory: EnemyFactory() {
    override fun createEnemy(): Entity {
        val randomValue = Math.random()
        return if (randomValue > 0.66) {
            Koopa()
        } else if (randomValue > 0.33) {
            Boo()
        } else {
            Goomba()
        }
    }
}