package observer.oop.subject

import observer.oop.observer.IObserver

interface ISubject {
    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObservers()
}