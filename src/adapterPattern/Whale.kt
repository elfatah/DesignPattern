package adapterPattern

class Whale : Fish {
    override fun swim() {
        println("Swimming")
    }

    override fun breath() {
        println("Breath using lungs")
    }

    override fun reporduce() {
        println("Giving birth")
    }
}