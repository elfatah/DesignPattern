package iteratorPattern

class KeyboardIterator(val keyboard: ArrayList<Product>) : ProductIterator {
    override fun hasNext(): Boolean {
        return keyboard.iterator().hasNext()
    }

    override fun next() {
        keyboard.iterator().next()
    }

    override fun remove(product: Product) {
        keyboard.remove(product)
    }
}