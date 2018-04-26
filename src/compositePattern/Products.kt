package iteratorPattern

import compositePattern.ProductComponent


class Products(
        val name: String
) : ProductComponent() {

    override fun getProductName(): String {
        return name
    }

    override fun showProductInfo() {
        println(getProductName())
    }
}