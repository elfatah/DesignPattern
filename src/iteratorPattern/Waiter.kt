package iteratorPattern

class Waiter(
        val keyboard: Keyboard,
        val laptop: Laptop
) {
    fun printProduct() {
        val laptopIterator = laptop.createIterator()
        val keyboardIterator = keyboard.createIterator()
        println("List of keyboard")
        printProduct(keyboardIterator)
        println()
        println("List of laptop")
        printProduct(laptopIterator)
    }

    private fun printProduct(iterator: Iterator<Product>) {
        iterator.forEach {
            println("${it.name} ${it.serialNo} ${it.price}")
        }
    }

}