package application.techniques

data class Item(val name: String)

class CartNotCheckedOut(val items: List<Item>)
class CartCheckedOut(val orderId: String)

fun checkout(cart: CartNotCheckedOut): CartCheckedOut = TODO()
