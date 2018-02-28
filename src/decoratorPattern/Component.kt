package decoratorPattern

abstract class Component : PersonalComputer() {
    abstract override fun totalPrize(): Long
    abstract override fun getDescription(): String
}