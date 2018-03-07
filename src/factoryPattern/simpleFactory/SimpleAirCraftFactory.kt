package factoryPattern.simpleFactory

const val SUKHOI = "sukhoi"
const val F22Raptop = "F22Raptop"

class SimpleAirCraftFactory {

    fun createAirCraft(type: String): AirCraft =
            when (type) {
                SUKHOI -> Sukhoi()
                F22Raptop -> F22()
                else -> throw IllegalArgumentException("This type of aircraft is currently unavailable")
            }

}