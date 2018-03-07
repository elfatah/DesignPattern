package factoryPattern.simpleFactory

class AirCraftDealer(private val simpleAirCraftFactory: SimpleAirCraftFactory) {
    fun orderAirCraft(type: String): AirCraft {
        val airCraft = simpleAirCraftFactory.createAirCraft(type)
        airCraft.prepareAirCraft()
        airCraft.testAirCraft()
        airCraft.packAirCraft()
        airCraft.shipAirCraft()
        return airCraft
    }
}