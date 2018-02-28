package decoratorPattern

class PowerSupply(private val personalComputer: PersonalComputer) : Component() {
    override fun totalPrize(): Long = personalComputer.totalPrize() + 800000
    override fun getDescription(): String = personalComputer.getDescription() + "\n+ Corsair 800 Watt Gold Modular"

    override fun totalDiscount(): Long = 0
}