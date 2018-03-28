package facadePattern

fun main(args: Array<String>) {
    val morningRoutine = MorningRoutine(bath = Bath(), breakfast = Breakfast(), reading = Reading())
    morningRoutine.start()
    println()
    morningRoutine.stop()
}