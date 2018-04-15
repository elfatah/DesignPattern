package templatePattern

class UserListActivity : BaseRecyclerViewActivity() {
    override fun setContentView() {
        println("User list content")
    }

    override fun getLayout() {
        println("User list layout")
    }

    override fun setUpRecyclerView() {
        println("User list recyclerView")
    }

    override fun setUpAdapter() {
        println("User list adapter")
    }

    override fun loadData() {
        println("Load data users")
    }

    override fun hasToolbar(): Boolean = false
}