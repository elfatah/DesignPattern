package statePattern

fun main(args: Array<String>) {
    val coffeeMaker = EspressoMachine()

    coffeeMaker.addCoffeeBeans()
    coffeeMaker.generateCoffee()
    println()

    coffeeMaker.generateCoffee()
    coffeeMaker.addCoffeeBeans()
    println()

    coffeeMaker.addCoffeeBeans()
    coffeeMaker.generateCoffee()
}