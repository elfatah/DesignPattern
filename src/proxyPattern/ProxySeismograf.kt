package proxyPattern

class ProxySeismograf : SeismografContract {
    override fun getData(): Int {
        val seismograf = Seismograf()
        return seismograf.getData()
    }
}