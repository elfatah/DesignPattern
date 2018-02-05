package strategyPattern

class NoSensor : WatchSensors {
    override fun sensorList() {
        println("No sensor")
    }
}