package facadePattern

class MorningRoutine
(
        private val bath: Bath,
        private val breakfast: Breakfast,
        private val reading: Reading
) {
    fun start() {
        bath.takeABath()
        bath.stopBath()
        breakfast.prepare()
        breakfast.eat()
        reading.read()
    }

    fun stop() {
        reading.stop()
        breakfast.cleanUp()
    }
}