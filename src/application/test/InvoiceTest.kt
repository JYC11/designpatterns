package application.test

class InvoiceTest : TestClass() {

    fun adder(a: Int, b: Int) = a + b

    @Test
    fun `adder should work`() {
        print("adder should work - ")
        val result = adder(2, 2)
        result shouldBe 4
    }

    @Test
    fun `this should fail`() {
        print("this should fail - ")
        val result = adder(2, 2)
        result shouldBe 5
    }
}

fun main() {
    val test = InvoiceTest()
    test.`adder should work`()
    test.`this should fail`()
}