package iterator.component

import iterator.component.MenuComponent

class Menu(
    val name: String,
    val description: String,
    val menuComponents: MutableList<MenuComponent> = mutableListOf(),
) : MenuComponent() {

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(index: Int): MenuComponent {
        return menuComponents[index]
    }

    override fun print() {
        println("$name: $description")

        menuComponents.forEach {
            it.print()
        }
    }
}