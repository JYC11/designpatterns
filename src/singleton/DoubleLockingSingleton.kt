package singleton

class DoubleLockingSingleton private constructor() {
    companion object {
        @Volatile
        private var instance: DoubleLockingSingleton? = null

        fun getInstance(): DoubleLockingSingleton {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = DoubleLockingSingleton()
                    }
                }
            }
            return instance!!
        }
    }
}

/*
Double-checked locking is a mechanism to reduce the overhead of synchronization by checking
the lock only once and creating the instance only if the lock is not already held by another
thread.
Every time we want to retrieve the singleton instance, we perform a null check.
If the singleton instance has already been created, we return it.
If there is no instance available, we’ll create it.

First, we create a lock using the synchronized keyword.
In a multithreaded application, it is possible that, in the meanwhile,
another thread created the instance. Therefore, we need another null check,
and only if the instance is still null we’ll create it
https://www.baeldung.com/kotlin/singleton-classes
*/