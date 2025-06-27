package application.techniques

interface Verified
interface Unverified

data class Email<T>(
    val value: String
)

fun verify(email: Email<Unverified>): Email<Verified> {
    // verification logic
    return Email(email.value)
}

fun sendWelcomeEmail(email: Email<Verified>) {
    // Only verified emails can be used here
    println("Welcome ${email.value}")
}

val email = Email<Unverified>("foo@example.com")

fun main() {
    sendWelcomeEmail(verify(email))
//    sendWelcomeEmail(email)
}

