package iterator.component

fun componentIteratorDemo() {
    val pancakeHouseMenu = Menu("Pancake House", "Breakfast")
    val dinerMenu = Menu("Diner Menu", "Lunch")
    val cafeMenu = Menu("Cafe Menu", "Cafe")
    val dessertMenu = Menu("Dessert Menu", "Dessert")

    val allMenus = Menu("All Menus", "All menus combined")

    pancakeHouseMenu.add(MenuItem("pancake", "standard pancake", false, 10.0))
    pancakeHouseMenu.add(MenuItem("waffles", "standard waffle", false, 10.0))
    pancakeHouseMenu.add(MenuItem("coffee", "black coffee", false, 3.0))
    pancakeHouseMenu.add(MenuItem("bacon and eggs", "bacon and eggs", false, 15.0))

    dinerMenu.add(MenuItem("steak and potatoes", "chuck steak and russet potatoes", false, 30.0))
    dinerMenu.add(MenuItem("clam chowder", "fresh clams", false, 20.0))
    dinerMenu.add(MenuItem("beer", "lager", false, 7.0))
    dinerMenu.add(MenuItem("lobster bisque", "comes with butter", false, 40.0))

    dessertMenu.add(MenuItem("Apple Pie", "Dessert", true, 1.59))
    dessertMenu.add(MenuItem("Tiramisu", "Dessert", true, 2.59))
    dessertMenu.add(MenuItem("Ice cream", "3 flavours", true, 2.0))
    dinerMenu.add(dessertMenu)

    cafeMenu.add(MenuItem("Sandwich", "BLT", false, 3.0))
    cafeMenu.add(MenuItem("Bagel", "cream cheese", true, 3.0))

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    val waitress = Waitress(allMenus = allMenus)
    waitress.printMenus()
}