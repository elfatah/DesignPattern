package factoryPattern.factory

class KoreanDealer : AirCraftDealer() {
    override fun createAirCraft(type: String): AirCraft =
            when (type) {
                SUKHOI -> KoreanSukhoi()
                F22Raptor -> KoreanF22()
                else -> throw IllegalArgumentException("This type of aircraft is currently unavailable")
            }

    override fun getName() {
        println("Korean Dealer")
    }
}