package decoratorPattern

class Ram(val personalComputer: PersonalComputer) : Component() {
    override fun totalPrize(): Long = personalComputer.totalPrize() + 3200000

    override fun getDescription(): String = personalComputer.getDescription() + "\n+ Corsair Vengeance 32GB"

    override fun totalDiscount(): Long = 0
}