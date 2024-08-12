package singleton

class LazySingleton private constructor() {
    companion object {
        val instance: LazySingleton by lazy {
            LazySingleton()
        }
    }
}

/*
A lazy delegate only allows us to initialize a property when it is first accessed.
The instance remains in memory until the application terminates
https://www.baeldung.com/kotlin/singleton-classes
*/
