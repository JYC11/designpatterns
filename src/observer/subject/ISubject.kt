package observer.subject

import observer.observer.IObserver

interface ISubject {
    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObservers()
}