package factories

import elements.block.AbstractBlock
import elements.coin.AbstractCoin

abstract class AbstractFactory {
    abstract fun createCoin() : AbstractCoin
    abstract fun createBlock() : AbstractBlock
}