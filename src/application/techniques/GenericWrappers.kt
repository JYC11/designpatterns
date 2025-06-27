package application.techniques

class Encrypted<T>(val ciphertext: String)
class Plain<T>(val value: T)

fun <T> encrypt(data: Plain<T>): Encrypted<T> {
    return TODO("Provide the return value")
}

fun <T> decrypt(data: Encrypted<T>): Plain<T> {
    return TODO("Provide the return value")
}

fun main() {
    val plainString = Plain("secret")
    val encryptedString = encrypt(plainString)
    val decryptedString = decrypt(encryptedString)
    println(encryptedString is Encrypted<String>)
    println(decryptedString is Plain<String>)
}