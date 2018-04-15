package templatePattern

fun main(args: Array<String>) {
    val userListActivity = UserListActivity()
    val cityListActivity = CityListActivity()

    userListActivity.loadScreen()
    println()
    cityListActivity.loadScreen()
}