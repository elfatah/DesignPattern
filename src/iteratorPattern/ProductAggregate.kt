package iteratorPattern


interface ProductAggregate {
    fun createIterator(): Iterator<Product>
}