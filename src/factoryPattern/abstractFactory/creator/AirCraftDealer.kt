package factoryPattern.abstractFactory.creator

import factoryPattern.abstractFactory.product.AirCraft

const val SUKHOI = "sukhoi"
const val F22Raptor = "F22Raptor"

abstract class AirCraftDealer {
    fun orderAirCraft(type: String): AirCraft {
        val airCraft = createAirCraft(type)
        airCraft.prepareAirCraft()
        airCraft.testAirCraft()
        airCraft.packAirCraft()
        airCraft.shipAirCraft()
        return airCraft
    }

    protected abstract fun createAirCraft(type: String): AirCraft
    abstract fun getName()
}