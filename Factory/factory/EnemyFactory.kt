package factory

import enemy.Entity

abstract class EnemyFactory {
    abstract fun createEnemy(): Entity
}