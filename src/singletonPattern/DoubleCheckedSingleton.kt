package singletonPattern

class DoubleCheckedSingleton {
    init {
        println("This is double checked singleton")
    }

    companion object {
        private var uniqeInstance: DoubleCheckedSingleton? = null
        fun getInstance(): DoubleCheckedSingleton? {
            synchronized(DoubleCheckedSingleton) {
                if (uniqeInstance == null)
                    uniqeInstance = DoubleCheckedSingleton()
            }
            return uniqeInstance
        }
    }
}