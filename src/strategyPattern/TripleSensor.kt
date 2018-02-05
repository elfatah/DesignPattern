package strategyPattern

class TripleSensor : WatchSensors {
    override fun sensorList() {
        println("Digital Compass")
        println("Barometer")
        println("Thermometer")
    }
}