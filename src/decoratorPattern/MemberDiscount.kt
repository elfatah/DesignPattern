package decoratorPattern

class MemberDiscount(private val personalComputer: PersonalComputer) : Discount() {
    override fun getDescription(): String = personalComputer.getDescription() + "\n+ Premium member discount"

    override fun totalDiscount(): Long = personalComputer.totalDiscount() + 500000

    override fun totalPrize(): Long = personalComputer.totalPrize() - 500000
}