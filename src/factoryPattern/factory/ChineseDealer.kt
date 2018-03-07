package factoryPattern.factory

class ChineseDealer : AirCraftDealer() {
    override fun getName() {
        println("Chinese Dealer")
    }

    override fun createAirCraft(type: String): AirCraft =
            when (type) {
                SUKHOI -> ChineseSukhoi()
                F22Raptor -> ChineseF22()
                else -> throw IllegalArgumentException("This type of aircraft is currently unavailable")
            }
}