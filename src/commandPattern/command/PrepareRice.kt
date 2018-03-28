package commandPattern.command

import commandPattern.receiver.FriedRiceRecipe

class PrepareRice(private val recipe: FriedRiceRecipe) : Command {
    override fun execute() {
        recipe.prepareRice()
    }
}