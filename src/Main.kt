import observerPattern.AirForceBomber
import observerPattern.CommandCenterImpl
import observerPattern.Marines
import strategyPattern.*

fun main(args: Array<String>) {

//    val mudmasterGWG1000 = AnalogWatch(modelName = "GWG1000", diameter = 5.5, price = 700000, watchSensors = TripleSensor())
//    val mudmasterGG1000 = AnalogWatch(modelName = "GG1000", diameter = 5.5, price = 700000, watchSensors = DualSensor())
//    val rangeman = DigitalWatch(modelName = "G9400", diameter = 5.5, price = 700000, watchSensors = TripleSensor())
//    val mudman = DigitalWatch(modelName = "G9000", diameter = 5.5, price = 700000, watchSensors = NoSensor())
//
//    val watches = ArrayList<Watch>()
//    watches.add(mudmasterGWG1000)
//    watches.add(mudmasterGG1000)
//    watches.add(rangeman)
//    watches.add(mudman)
//
//    watches.forEach {
//        println(it.modelName)
//        it.watchSensors.sensorList()
//        println()
//    }

//
    val jakartaHQ = CommandCenterImpl()

    val marines = Marines(commandCenter = jakartaHQ, name = "TNI AD")

    val airForceBomber = AirForceBomber(commandCenter = jakartaHQ, name = "TNI AU")


    jakartaHQ.updateCommand(0123.123, 0129301.231)

    println("${airForceBomber.name} has completed mission")
    println("${airForceBomber.name} out")
    airForceBomber.unregister()

    jakartaHQ.updateCommand(23123.34,123.221)

}