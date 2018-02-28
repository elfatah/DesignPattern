package decoratorPattern

class VgaCard(private val personalComputer: PersonalComputer) : Component() {

    override fun totalPrize(): Long = personalComputer.totalPrize() + 15000000
    override fun getDescription(): String = personalComputer.getDescription() + "\n+ GTX 1080ti"
    override fun totalDiscount(): Long = 0
}