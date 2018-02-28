package decoratorPattern

class Processor(private val personalComputer: PersonalComputer) : Component() {
    override fun totalPrize(): Long = personalComputer.totalPrize() + 5000000
    override fun getDescription(): String = personalComputer.getDescription() + "\n+ i7 7700K Kabylake 3.5 Ghz"

    override fun totalDiscount(): Long = 0
}