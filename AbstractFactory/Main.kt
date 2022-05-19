import factories.Factory2D
import factories.Factory3D

fun main(args: Array<String>) {
    val factory2D = Factory2D()
    val factory3D = Factory3D()
    val block3D = factory3D.createBlock()
    val coin3D = factory3D.createCoin()
    val block2D = factory2D.createBlock()
    val coin2D = factory2D.createCoin()
    block3D.render()
    coin3D.render()
    block2D.render()
    coin2D.render()
}