package templatePattern

abstract class BaseRecyclerViewActivity {
    abstract fun setContentView()
    abstract fun getLayout()
    abstract fun setUpRecyclerView()
    abstract fun setUpAdapter()
    abstract fun loadData()
    fun loadScreen() {
        getLayout()
        if (hasToolbar()) setUpToolbar()
        setUpAdapter()
        setUpRecyclerView()
        setContentView()
        loadData()
    }

    open fun hasToolbar(): Boolean = true

    private fun setUpToolbar() {
        println("Set up toolbar")
    }
}