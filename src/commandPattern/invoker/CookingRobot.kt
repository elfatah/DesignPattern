package commandPattern.invoker

import commandPattern.command.Command

class CookingRobot(private val commandList: ArrayList<Command>) {

    fun cook() {
        for (command in commandList) {
            command.execute()
        }
    }
}