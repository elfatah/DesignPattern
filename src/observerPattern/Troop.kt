package observerPattern

interface Troop {
    fun update(latitude: Double, longitude: Double)
    fun unregister()
}