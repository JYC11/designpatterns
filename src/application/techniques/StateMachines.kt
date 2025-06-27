package application.techniques

sealed interface LoanState
object ApplicationSubmitted : LoanState
object UnderReview : LoanState
object Approved : LoanState
object Rejected : LoanState

data class Loan<T : LoanState>(val id: String)

fun review(loan: Loan<ApplicationSubmitted>): Loan<UnderReview> = TODO()
fun approve(loan: Loan<UnderReview>): Loan<Approved> = TODO()
fun reject(loan: Loan<UnderReview>): Loan<Rejected> = TODO()
