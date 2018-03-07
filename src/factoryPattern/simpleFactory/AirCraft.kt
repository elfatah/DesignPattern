package factoryPattern.simpleFactory

abstract class AirCraft(
        private val modelName: String,
        private val engine: String,
        private val seat: Int,
        private val weapon: ArrayList<String>) {

    open fun prepareAirCraft() {
        println("Prepare $modelName")
        println("Install $engine")
        println("Add $seat seats")
        println("Install weapon: ")
        weapon.forEach { println("\t(-) $it") }
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