package observerPattern

abstract class TroopsImpl(private var commandCenter: CommandCenter, var name: String) : Troop {
    init {
        commandCenter.registerTroops(this)
    }

    override fun unregister() {
        commandCenter.removeTroops(this)
    }

}