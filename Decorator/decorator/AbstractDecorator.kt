package decorator

import enemy.Enemy

abstract class AbstractDecorator(protected val enemyDecorated: Enemy): Enemy {
    override fun takeDamage(): Int = enemyDecorated.takeDamage()
}