package commandPattern

class PrepareRice(private val recipe: FriedRiceRecipe) : Command {
    override fun execute() {
        recipe.prepareRice()
    }
}