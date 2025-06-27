package application

sealed class PaymentMethod {
    abstract fun pay(amount: Int)

    data class CreditCard(val number: String) : PaymentMethod() {
        override fun pay(amount: Int) {
            TODO("Not yet implemented")
        }
    }

    data class BankTransfer(val iban: String) : PaymentMethod() {
        override fun pay(amount: Int) {
            TODO("Not yet implemented")
        }
    }

    object Crypto : PaymentMethod() {
        override fun pay(amount: Int) {
            TODO("Not yet implemented")
        }
    }
}
