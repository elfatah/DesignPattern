package adapterPattern

class MammalFishAdapter(private val fish: Fish) : Mammal {
    override fun run() {
        fish.swim()
    }

    override fun breath() {
        fish.breath()
    }

    override fun reproduce() {
        fish.reporduce()
    }
}