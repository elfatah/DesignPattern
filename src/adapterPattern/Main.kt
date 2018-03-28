package adapterPattern

fun main(args: Array<String>) {
    val mammalFishAdapter = MammalFishAdapter(Whale())
    mammalFishAdapter.breath()
    mammalFishAdapter.reproduce()
    mammalFishAdapter.run()
    println()
    val monotremeAdapter = MonotremeAdapter(Platypus())
    monotremeAdapter.breath()
    monotremeAdapter.reproduce()
    monotremeAdapter.run()
    println()
    val human = Human()
    human.breath()
    human.reproduce()
    human.run()
}
