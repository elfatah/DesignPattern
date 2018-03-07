package factoryPattern.factory

fun main(args: Array<String>) {
    val dealer = ChineseDealer()
    val koreanDealer = KoreanDealer()
    dealer.getName()
    dealer.orderAirCraft(F22Raptor)
    println()
    koreanDealer.getName()
    koreanDealer.orderAirCraft(SUKHOI)
}