package iterator.component

abstract class MenuComponent {
    abstract fun add(menuComponent: MenuComponent)
    abstract fun remove(menuComponent: MenuComponent)
    abstract fun getChild(index: Int): MenuComponent
    abstract fun print()
}