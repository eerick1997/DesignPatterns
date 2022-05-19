package factories

import elements.block.AbstractBlock
import elements.block.Block2D
import elements.coin.AbstractCoin
import elements.coin.Coin2D

class Factory2D : AbstractFactory() {
    override fun createCoin(): AbstractCoin = Coin2D()

    override fun createBlock(): AbstractBlock = Block2D()
}