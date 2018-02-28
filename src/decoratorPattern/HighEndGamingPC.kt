package decoratorPattern

class HighEndGamingPC : PersonalComputer() {

    override fun getDescription(): String = "PC for intense gaming"

    override fun totalPrize(): Long = 5000000

    override fun totalDiscount(): Long = 0
}