package application.techniques

interface Role
object Admin : Role
object RegularUser : Role

data class Session<T : Role>(val userId: UserId, val role: T)

fun accessSensitiveSettings(session: Session<Admin>) {
    // only Admins allowed
    println("Accessing admin settings")
}


fun main() {
    val adminSession = Session(UserId("123"), Admin)
    accessSensitiveSettings(adminSession)
    val regularSession = Session(UserId("123"), RegularUser)
//    accessSensitiveSettings(regularSession)
}
