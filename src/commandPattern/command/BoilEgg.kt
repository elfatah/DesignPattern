package commandPattern.command

import commandPattern.receiver.BoilEggRecipe

class BoilEgg(private val recipe: BoilEggRecipe) : Command {
    override fun execute() {
        recipe.boilEgg()
    }
}