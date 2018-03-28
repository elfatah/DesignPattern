package adapterPattern

class Platypus : Monotreme {
    override fun run() {
        println("Running")
    }

    override fun layEggs() {
        println("Laying eggs")
    }

    override fun breath() {
        println("Breath using lungs")
    }
}