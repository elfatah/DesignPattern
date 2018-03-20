package commandPattern

class PrepareChicken(private val recipe: BakeChickenRecipe) : Command {
    override fun execute() {
        recipe.prepareChicken()
    }
}