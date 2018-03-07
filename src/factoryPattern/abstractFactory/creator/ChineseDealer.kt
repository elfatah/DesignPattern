package factoryPattern.abstractFactory.creator

import factoryPattern.abstractFactory.factory.ChineseFactory
import factoryPattern.abstractFactory.product.AirCraft
import factoryPattern.abstractFactory.product.F22
import factoryPattern.abstractFactory.product.Sukhoi

class ChineseDealer(private val factory: ChineseFactory) : AirCraftDealer() {
    override fun createAirCraft(type: String): AirCraft =
            when (type) {
                SUKHOI -> Sukhoi(factory).apply { modelName += " Chinese edition" }
                F22Raptor -> F22(factory).apply { modelName += " Chinese edition" }
                else -> throw IllegalArgumentException("This type of aircraft is currently unavailable")
            }

    override fun getName() {
        println("Chinese dealer")
    }
}