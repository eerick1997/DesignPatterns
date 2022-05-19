import factory.RandomEnemyFactory

fun main(args: Array<String>) {
    val enemyFactory = RandomEnemyFactory()
    val game = Game(enemyFactory)
    game.gameLogic()
    game.processGameLogic()
}
