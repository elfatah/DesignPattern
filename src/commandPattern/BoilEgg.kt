package commandPattern

class BoilEgg(private val recipe: BoilEggRecipe) : Command {
    override fun execute() {
        recipe.boilEgg()
    }
}