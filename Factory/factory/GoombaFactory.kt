package factory

import enemy.Entity
import enemy.Goomba

class GoombaFactory: EnemyFactory() {
    override fun createEnemy(): Entity = Goomba()
}