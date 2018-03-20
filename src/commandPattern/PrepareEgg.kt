package commandPattern

class PrepareEgg(private val recipe: BoilEggRecipe) : Command {
    override fun execute() {
        recipe.prepareEgg()
    }
}