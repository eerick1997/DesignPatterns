package decorator

import enemy.Enemy

class HelmetDecorator(protected val decoratedEnemy: Enemy) : AbstractDecorator(decoratedEnemy) {
    override fun takeDamage(): Int = decoratedEnemy.takeDamage() / 2
}