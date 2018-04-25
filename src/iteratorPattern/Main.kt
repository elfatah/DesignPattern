package iteratorPattern

fun main(args: Array<String>) {
    val waiter = Waiter(keyboard = Keyboard(), laptop = Laptop())
    waiter.printProduct()
}