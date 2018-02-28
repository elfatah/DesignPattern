package decoratorPattern

abstract class Discount : PersonalComputer() {

    abstract override fun getDescription(): String
    abstract override fun totalDiscount(): Long
}