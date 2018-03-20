package commandPattern

class CookingRobot(private val commandList: ArrayList<Command>) {

    fun cook() {
        for (command in commandList) {
            command.execute()
        }
    }
}