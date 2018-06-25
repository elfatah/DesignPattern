package statePattern

class EmptyCoffeeBean(private val espressoMachine: EspressoMachine) : State {
    override fun addCoffeeBean() {
        println("Coffee bean added")
        espressoMachine.state = espressoMachine.hasCoffeeBean

    }

    override fun generateCoffee() {
        println("Cannot generate Coffee - Add some Coffee Bean first")
    }

}