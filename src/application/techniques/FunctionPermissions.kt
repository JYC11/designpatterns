package application.techniques

interface AccountState

class BankAccount<T : AccountState>(val id: String)

interface Active : AccountState
interface Frozen : AccountState

fun <T : Active> withdraw(account: BankAccount<T>, amount: Int) {
    println("withdrawing $amount from ${account.id}")
}

fun main() {
    val account = BankAccount<Frozen>("123")
//    withdraw(account, 100)
}