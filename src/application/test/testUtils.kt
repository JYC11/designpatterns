package application.test

infix fun <T> T.shouldBe(expected: T) {
    if (this != expected) {
        println("FAIL: Expected <$expected>, but got <$this>")
    } else {
        println("PASS")
    }
}

@Target(AnnotationTarget.FUNCTION)
annotation class Test

open class TestClass
