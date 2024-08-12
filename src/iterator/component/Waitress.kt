package iterator.component

class Waitress(
    private val allMenus: MenuComponent
) {
    fun printMenus() {
        allMenus.print()
    }
}