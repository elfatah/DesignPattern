package decoratorPattern

class Cooler(private val personalComputer: PersonalComputer) : Component() {
    override fun totalPrize(): Long = personalComputer.totalPrize() + 1000000

    override fun getDescription(): String = personalComputer.getDescription() + "\n+ water cooling system"

    override fun totalDiscount(): Long = 0
}