package application

class UnvalidatedApplication(val name: String?, val dob: String?)
class ValidatedApplication(val name: String, val dob: String)

fun validate(app: UnvalidatedApplication): ValidatedApplication {
    requireNotNull(app.name)
    requireNotNull(app.dob)
    return ValidatedApplication(app.name, app.dob)
}

fun submit(app: ValidatedApplication) { /* ... */
}
