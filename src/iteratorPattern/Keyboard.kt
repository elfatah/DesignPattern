package iteratorPattern

class Keyboard : ProductAggregate {

    private val keyboards = arrayListOf<Product>()

    init {
        addProduct(Product("Logitech Gaming Keyboard", "MG123", 1200000.00))
        addProduct(Product("Corsair Gaming Keyboard", "AX123", 1220000.00))
        addProduct(Product("Razer Gaming Keyboard", "CV334", 2200300.00))
    }

    private fun addProduct(product: Product) {
        keyboards.add(product)
    }

    override fun createIterator(): Iterator<Product> = keyboards.iterator()

}