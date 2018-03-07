package factoryPattern.abstractFactory.creator

import factoryPattern.abstractFactory.factory.KoreanFactory
import factoryPattern.abstractFactory.product.AirCraft
import factoryPattern.abstractFactory.product.F22
import factoryPattern.abstractFactory.product.Sukhoi

class KoreanDealer(private val factory: KoreanFactory) : AirCraftDealer() {
    override fun createAirCraft(type: String): AirCraft =
            when (type) {
                SUKHOI -> Sukhoi(factory).apply { modelName += " Korean edition" }
                F22Raptor -> F22(factory).apply { modelName += " Korean edition" }
                else -> throw IllegalArgumentException("This type of aircraft is currently unavailable")
            }

    override fun getName() {
        println("Korean dealer")
    }
}