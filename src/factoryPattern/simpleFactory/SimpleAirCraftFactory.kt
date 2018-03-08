package factoryPattern.simpleFactory

const val SUKHOI = "sukhoi"
const val F22Raptor = "F22Raptor"

class SimpleAirCraftFactory {

    fun createAirCraft(type: String): AirCraft =
            when (type) {
                SUKHOI -> Sukhoi()
                F22Raptor -> F22()
                else -> throw IllegalArgumentException("This type of aircraft is currently unavailable")
            }

}