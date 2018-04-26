package compositePattern

import iteratorPattern.Products


fun main(args: Array<String>) {
    val gamingPeripheral = ProductCategory("Gaming Peripheral")

    val keyboard = ProductCategory("Keyboard Gaming")
    gamingPeripheral.add(keyboard)
    keyboard.add(Products("Logitech Gaming Keyboard"))
    keyboard.add(Products("Rexus Gaming Keyboard"))
    keyboard.add(Products("Razer Gaming Keyboard"))
    val seller = Seller(gamingPeripheral)
    seller.displayProducts()
}