package compositePattern

class ProductCategory(
        val name: String
) : ProductComponent() {
    private val productComponents = arrayListOf<ProductComponent>()

    override fun add(productComponent: ProductComponent) {
        productComponents.add(productComponent)
    }

    override fun remove(productComponentIterator: ProductComponent) {
        productComponents.remove(productComponentIterator)
    }

    override fun getComponent(componentIdx: Int): ProductComponent {
        return productComponents[componentIdx]
    }

    override fun showProductInfo() {

        println(name)
        val iterator = productComponents.iterator()
        iterator.forEach {
            it.showProductInfo()
        }
    }
}