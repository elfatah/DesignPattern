package strategyPattern

class SingleSensor : WatchSensors {
    override fun sensorList() {
        println("Digital Compass")
    }
}