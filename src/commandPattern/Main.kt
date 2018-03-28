package commandPattern

import commandPattern.command.*
import commandPattern.invoker.CookingRobot
import commandPattern.receiver.BakeChickenRecipe
import commandPattern.receiver.BoilEggRecipe
import commandPattern.receiver.FriedRiceRecipe

fun main(args: Array<String>) {
    println("---- Make fried rice ----")
    val recipe = FriedRiceRecipe()
    var robot = CookingRobot(arrayListOf(PrepareRice(recipe), FryRice(recipe)))
    robot.cook()
    println()

    println("---- Boil egg----")
    val recipe2 = BoilEggRecipe()
    robot = CookingRobot(arrayListOf(PrepareEgg(recipe2), BoilEgg(recipe2)))
    robot.cook()
    println()

    println("---- Bake chicken----")
    val recipe3 = BakeChickenRecipe()
    robot = CookingRobot(arrayListOf(PrepareChicken(recipe3), BakeChicken(recipe3)))
    robot.cook()

}