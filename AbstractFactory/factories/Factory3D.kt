package factories

import elements.block.AbstractBlock
import elements.block.Block3D
import elements.coin.AbstractCoin
import elements.coin.Coin3D

class Factory3D : AbstractFactory(){
    override fun createCoin(): AbstractCoin = Coin3D()

    override fun createBlock(): AbstractBlock = Block3D()
}