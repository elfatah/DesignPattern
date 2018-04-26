package compositePattern

class Seller(private val productComponent: ProductComponent) {
    fun displayProducts() {
        productComponent.showProductInfo()
    }
}