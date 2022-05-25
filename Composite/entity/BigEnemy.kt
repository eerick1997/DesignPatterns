package entity

class BigEnemy : Entity {

    private val parts: MutableList<Entity> = mutableListOf()

    init {
        parts.add(EnemyLeftArm())
        parts.add(EnemyRightArm())
        parts.add(EnemyLeftLeg())
        parts.add(EnemyRightLeg())
    }

    override fun someLogic() {
        println("Enemy is going to attack!")
        parts.forEach { part -> part.someLogic() }
    }
}