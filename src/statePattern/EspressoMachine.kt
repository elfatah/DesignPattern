package statePattern

class EspressoMachine {
    var emptyCoffeeBean: EmptyCoffeeBean = EmptyCoffeeBean(this)
    var hasCoffeeBean: HasCoffeeBean = HasCoffeeBean(this)

    var state: State = emptyCoffeeBean

    fun addCoffeeBeans() {
        state.addCoffeeBean()
    }

    fun generateCoffee() {
        state.generateCoffee()
    }


}