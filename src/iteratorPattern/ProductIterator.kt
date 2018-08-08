package iteratorPattern

interface ProductIterator {
    fun hasNext(): Boolean
    fun next()
    fun remove(product: Product)
}