package statePattern

class HasCoffeeBean(private val espressoMachine: EspressoMachine) : State {
    override fun addCoffeeBean() {
        println("Coffee bean is still available")

    }

    override fun generateCoffee() {
        println("Generate coffee")
        espressoMachine.state = espressoMachine.emptyCoffeeBean
    }
}