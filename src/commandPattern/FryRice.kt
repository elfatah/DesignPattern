package commandPattern

class FryRice(private val recipe: FriedRiceRecipe) : Command {
    override fun execute() {
        recipe.fryRice()
    }
}