package commandPattern.command

import commandPattern.receiver.BakeChickenRecipe

class PrepareChicken(private val recipe: BakeChickenRecipe) : Command {
    override fun execute() {
        recipe.prepareChicken()
    }
}