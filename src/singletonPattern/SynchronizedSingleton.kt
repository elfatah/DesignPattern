package singletonPattern

class SynchronizedSingleton {

    init {
        println("This is synchronized singleton ")
    }

    companion object {
        private var synchronizedSingleton: SynchronizedSingleton? = null

        fun getInstance(): SynchronizedSingleton? {
            synchronized(this) {
                if (synchronizedSingleton == null)
                    synchronizedSingleton = SynchronizedSingleton()
            }
            return synchronizedSingleton
        }
    }
}