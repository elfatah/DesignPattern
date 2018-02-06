package observerPattern

class Marines(commandCenter: CommandCenter, name: String) : TroopsImpl(commandCenter, name) {

    override fun update(latitude: Double, longitude: Double) {
        println("$name received new command")
        println("location $latitude,$longitude")
        println("$name en route")
        println()

    }

}