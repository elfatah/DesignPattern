package decoratorPattern

class AnniversaryDiscount(private val personalComputer: PersonalComputer) : Discount() {
    override fun getDescription(): String = personalComputer.getDescription() + "\n+ 10th anniversary discount"

    override fun totalDiscount(): Long = personalComputer.totalDiscount() + 100000

    override fun totalPrize(): Long = personalComputer.totalPrize() - 100000
}