package observerPattern

interface CommandCenter {

    fun registerTroops(troop: Troop)

    fun removeTroops(troop: Troop)

    fun sendCommand()

}