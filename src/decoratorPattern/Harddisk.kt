package decoratorPattern

class Harddisk(private val personalComputer: PersonalComputer) : Component() {
    override fun totalPrize(): Long = personalComputer.totalPrize() + 2000000

    override fun getDescription(): String = personalComputer.getDescription() + "\n+ SSD Samsung 960 Evo 512GB"

    override fun totalDiscount(): Long = 0
}