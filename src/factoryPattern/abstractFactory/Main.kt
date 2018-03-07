package factoryPattern.abstractFactory

import factoryPattern.abstractFactory.creator.ChineseDealer
import factoryPattern.abstractFactory.creator.KoreanDealer
import factoryPattern.abstractFactory.creator.SUKHOI
import factoryPattern.abstractFactory.factory.ChineseFactory
import factoryPattern.abstractFactory.factory.KoreanFactory

fun main(args: Array<String>) {
    val koreanDealer = KoreanDealer(KoreanFactory())
    val chineseDealer = ChineseDealer(ChineseFactory())
    koreanDealer.getName()
    koreanDealer.orderAirCraft(SUKHOI)
    println()
    chineseDealer.getName()
    chineseDealer.orderAirCraft(SUKHOI)
}