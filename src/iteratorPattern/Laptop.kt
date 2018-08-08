package iteratorPattern

class Laptop : ProductAggregate {

    private val laptop = hashMapOf<String, Product>()

    init {
        addProduct(Product("Gigabyte 15X V8", "ASA1233", 3450000.0))
        addProduct(Product("Macbook Pro", "MGDJAJK", 3650000.0))
        addProduct(Product("Dell XPS 15", "DDSDS133", 2450000.0))

    }

    private fun addProduct(product: Product) {
        laptop[product.name] = product
    }

    override fun createIterator(): Iterator<Product> {
        return laptop.values.iterator()
    }
}