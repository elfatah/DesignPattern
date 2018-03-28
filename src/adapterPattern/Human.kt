package adapterPattern

class Human : Mammal {
    override fun run() {
        println("Running")
    }

    override fun breath() {
        println("Breath using lungs")
    }

    override fun reproduce() {
        println("Giving birth")
    }
}