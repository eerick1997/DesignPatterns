import decorator.ArmourDecorator
import decorator.HelmetDecorator
import enemy.BaseEnemy

fun main(args: Array<String>) {
    val baseEnemy = BaseEnemy()
    val helmetEnemy = HelmetDecorator(baseEnemy)
    val helmetAndArmourEnemy = ArmourDecorator(helmetEnemy)
    val computedDamage = helmetAndArmourEnemy.takeDamage()
    println(computedDamage)
}