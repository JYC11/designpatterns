package application

@JvmInline
value class UserId(val value: String)

@JvmInline
value class Amount(val cents: Int) {
    init {
        require(cents >= 0) { "Amount cannot be negative" }
    }
}

@JvmInline
value class OrgId(val value: String)

fun assignUserToOrg(userId: UserId, orgId: OrgId) { /* ... */
}


fun main() {
    assignUserToOrg(UserId("abc"), OrgId("xyz"))
    assignUserToOrg(OrgId("abc"), UserId("xyz"))
}
