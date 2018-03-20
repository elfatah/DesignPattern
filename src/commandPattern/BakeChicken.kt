package commandPattern

class BakeChicken(private val recipe: BakeChickenRecipe) : Command {
    override fun execute() {
        recipe.bakeChicken()
    }
}