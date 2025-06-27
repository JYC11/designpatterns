package application.techniques

sealed interface Discount {
    fun apply(amount: Int): Int
}

object NoDiscount : Discount {
    override fun apply(amount: Int) = amount
}

//data class Percentage(val percent: Int) : Discount {
//    override fun apply(amount: Int) = amount * (100 - percent) / 100
//}
