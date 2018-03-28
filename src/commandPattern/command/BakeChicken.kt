package commandPattern.command

import commandPattern.receiver.BakeChickenRecipe

class BakeChicken(private val recipe: BakeChickenRecipe) : Command {
    override fun execute() {
        recipe.bakeChicken()
    }
}