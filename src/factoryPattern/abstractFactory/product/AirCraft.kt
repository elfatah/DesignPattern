package factoryPattern.abstractFactory.product

import factoryPattern.abstractFactory.engine.Engine
import factoryPattern.abstractFactory.weapon.Weapon

abstract class AirCraft(
        var modelName: String,
        private val engine: Engine,
        private val seat: Int,
        private val weapon: ArrayList<Weapon>) {

    open fun prepareAirCraft() {
        println("Prepare $modelName")
        println("Install ${engine.getName()}")
        println("Add $seat seats")
        println("Install weapon: ")
        weapon.forEach { println("\t(-) ${it.getName()}") }
    }

    fun testAirCraft() {
        println("Test $modelName")
    }

    fun packAirCraft() {
        println("Pack $modelName")
    }

    fun shipAirCraft() {
        println("ship $modelName")
    }
}