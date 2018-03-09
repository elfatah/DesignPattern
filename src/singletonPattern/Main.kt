package singletonPattern

fun main(args: Array<String>) {
    ClassicSingleton.getInstance()
    ClassicSingleton.getInstance()

    DoubleCheckedSingleton.getInstance()
    DoubleCheckedSingleton.getInstance()

    EagerlySingleton.getInstance()
    EagerlySingleton.getInstance()

    SynchronizedSingleton.getInstance()
    SynchronizedSingleton.getInstance()
}