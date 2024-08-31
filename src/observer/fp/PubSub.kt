package observer.fp

typealias Subscriber = () -> Unit

fun registerSubscriber(subscribers: MutableList<Subscriber>, subscriber: () -> Unit) {
    subscribers.add(subscriber)
}

fun notifySubscribers(subscribers: MutableList<Subscriber>) {
    subscribers.forEach { subscriber -> subscriber() }
}

fun publisher() {
    val subscriber1: Subscriber = {
        println("subscriber 1 has been notified")
    }

    val subscriber2: Subscriber = {
        println("subscriber 2 has been notified")
    }

    val subscriber3: Subscriber = {
        println("subscriber 3 has been notified")
    }

    val subscribers = mutableListOf<Subscriber>()

    registerSubscriber(subscribers, subscriber1)
    registerSubscriber(subscribers, subscriber2)
    registerSubscriber(subscribers, subscriber3)

    notifySubscribers(subscribers)
}