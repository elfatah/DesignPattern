package singletonPattern

class EagerlySingleton {
    init {
        println("This is eagerly singleton")
    }
    companion object {
        private val eagerlySingleton = EagerlySingleton()
        fun getInstance() = eagerlySingleton
    }
}