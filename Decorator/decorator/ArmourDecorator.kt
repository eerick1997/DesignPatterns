package decorator

import enemy.Enemy

class ArmourDecorator(protected val decoratedEnemy: Enemy) : AbstractDecorator(decoratedEnemy) {
    override fun takeDamage(): Int = decoratedEnemy.takeDamage() / 2
}