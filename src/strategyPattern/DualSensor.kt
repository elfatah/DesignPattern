package strategyPattern

class DualSensor : WatchSensors {
    override fun sensorList() {
        println("Digital Compass")
        println("Thermometer")
    }
}