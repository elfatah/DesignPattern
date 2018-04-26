package compositePattern

abstract class ProductComponent {
    open fun add(productComponent: ProductComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(productComponent: ProductComponent) {
        throw UnsupportedOperationException()
    }

    open fun getComponent(componentIdx: Int): ProductComponent {
        throw UnsupportedOperationException()
    }

    open fun getProductName(): String {
        throw UnsupportedOperationException()
    }

    open fun showProductInfo() {
        throw UnsupportedOperationException()
    }
}