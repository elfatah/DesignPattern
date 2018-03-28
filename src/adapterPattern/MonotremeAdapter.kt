package adapterPattern

class MonotremeAdapter(private val monotreme: Monotreme) : Mammal {
    override fun run() {
        monotreme.run()
    }

    override fun breath() {
        monotreme.breath()
    }

    override fun reproduce() {
        monotreme.layEggs()
    }
}