import strategyPattern.*

fun main(args: Array<String>) {

    val mudmasterGWG1000 = AnalogWatch(diameter = 5.5, price = 700000, watchSensors = TripleSensor())
    val mudmasterGG1000 = AnalogWatch(diameter = 5.5, price = 700000, watchSensors = DualSensor())
    val rangeman = DigitalWatch(diameter = 5.5, price = 700000, watchSensors = TripleSensor())
    val mudman = DigitalWatch(diameter = 5.5, price = 700000, watchSensors = NoSensor())

    val watches = ArrayList<Watch>()
    watches.add(mudmasterGWG1000)
    watches.add(mudmasterGG1000)
    watches.add(rangeman)
    watches.add(mudman)

    watches.forEach {
        it.watchSensors.sensorList()
        println()
    }

}