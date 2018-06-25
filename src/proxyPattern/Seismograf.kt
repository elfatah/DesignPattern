package proxyPattern

import java.util.*

class Seismograf : SeismografContract {

    override fun getData(): Int = getDataFromSensor()

    private fun getDataFromSensor(): Int = Random(2).nextInt()
}