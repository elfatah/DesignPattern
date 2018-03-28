package commandPattern.command

import commandPattern.receiver.BoilEggRecipe

class PrepareEgg(private val recipe: BoilEggRecipe) : Command {
    override fun execute() {
        recipe.prepareEgg()
    }
}