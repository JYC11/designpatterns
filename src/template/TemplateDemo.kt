package template

fun templateDemo() {
    val coffee = Coffee()
    val tea = Tea()

    coffee.prepareRecipe(needCondiment = "y")

    tea.prepareRecipe()
}