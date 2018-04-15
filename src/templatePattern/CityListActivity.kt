package templatePattern

class CityListActivity : BaseRecyclerViewActivity() {


    override fun setContentView() {
        println("City list content")
    }

    override fun getLayout() {
        println("City list layout")
    }

    override fun setUpRecyclerView() {
        println("City list recyclerView")
    }

    override fun setUpAdapter() {
        println("City list adapter")
    }

    override fun loadData() {
        println("Load data Cities")
    }

}