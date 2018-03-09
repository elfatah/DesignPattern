package singletonPattern

class ClassicSingleton private constructor() {
    init {
        println("This is classic singleton")
    }

    companion object {
        private var uniqeInstance: ClassicSingleton? = null
        fun getInstance(): ClassicSingleton? {
            if (uniqeInstance == null)
                uniqeInstance = ClassicSingleton()
            return uniqeInstance
        }
    }


}