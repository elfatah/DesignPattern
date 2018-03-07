package factoryPattern.simpleFactory

fun main(args: Array<String>) {
    val factory = SimpleAirCraftFactory()
    val store = AirCraftDealer(factory)
    store.orderAirCraft(SUKHOI)
    println()
    store.orderAirCraft(F22Raptop)
}