package proxyPattern


fun main(args: Array<String>) {
    val seismograf: SeismografContract = ProxySeismograf()
    println(seismograf.getData())
}