package commandPattern.command

import commandPattern.receiver.FriedRiceRecipe

class FryRice(private val recipe: FriedRiceRecipe) : Command {
    override fun execute() {
        recipe.fryRice()
    }
}