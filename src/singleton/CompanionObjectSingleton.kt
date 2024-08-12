package singleton

class CompanionObjectSingleton private constructor() {
    companion object {

        @Volatile
        private var instance: CompanionObjectSingleton? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: CompanionObjectSingleton().also { instance = it }
            }
    }

    fun doSomething() = "Doing something"
}

/*
A companion object is a special type of object that is associated with a class and
can be used to store static members and methods for the class.

The @Volatile annotation is needed to ensure that the instance property is updated atomically.
This prevents other threads from creating more instances and breaking the singleton pattern.
We need the synchronized keyword in the static getInstance method to prevent
accessing the method from multiple threads simultaneously.
https://www.baeldung.com/kotlin/singleton-classes
*/