package application

sealed interface AllowedForRefund
class CompletedOrder : AllowedForRefund
class CanceledOrder : AllowedForRefund
class PendingOrder // ❌ not allowed

fun <T : AllowedForRefund> processRefund(order: T) {
    // Only certain order states can be refunded
    println("processing refund for $order")
}


fun main() {
    processRefund(CompletedOrder())
    processRefund(CanceledOrder())
    processRefund(PendingOrder()) // won't compile
}