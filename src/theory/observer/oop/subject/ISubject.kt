package theory.observer.oop.subject

import theory.observer.oop.observer.IObserver

interface ISubject {
    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObservers()
}