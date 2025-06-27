package application

class FormBuilder {
    private var hasSubmit = false

    fun input(name: String) = println("input: $name")

    fun submitButton(): SubmitAdded {
        hasSubmit = true
        return SubmitAdded()
    }

    class SubmitAdded
}

fun form(init: FormBuilder.() -> FormBuilder.SubmitAdded) {
    val builder = FormBuilder()
    builder.init() // must end with submitButton()
}

fun main() {
    form {
        input("email")
        // no submitButton -> compile error
    }

    form {
        input("email")
        submitButton()
    }
}
