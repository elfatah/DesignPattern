package decoratorPattern

abstract class PersonalComputer {

    private var description: String = "Empty PC"

    open fun getDescription() = description

    abstract fun totalPrize(): Long

    abstract fun totalDiscount(): Long
}