package observerPattern

class CommandCenterImpl() : CommandCenter {

    var troops = ArrayList<Troop>()
    private var latitude: Double = 0.0
    private var longitude: Double = 0.0


    override fun registerTroops(troop: Troop) {
        troops.add(troop)
        println("New troop has been added")
        println()

    }

    override fun removeTroops(troop: Troop) {
        if (troops.contains(troop)) {
            troops.remove(troop)
            println("A troop has been deleted")
            println()
        }
    }

    override fun sendCommand() {
        troops.forEach {
            it.update(latitude, longitude)
        }

    }

    fun updateCommand(latitude: Double, longitude: Double) {

        this.latitude = latitude
        this.longitude = longitude
        sendCommand()
    }
}