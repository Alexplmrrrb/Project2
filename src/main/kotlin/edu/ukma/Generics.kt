package edu.ukma

//#region covariance
class Box

//#endregion


//#region contravariance
interface EventListener

open class Event

class ClickEvent : Event()

class KeyEvent : Event()

//#endregion


//#region avoiding type erasure
class Person(
    val name: String,
    val age: Int
)

//#endregion


//#region start-projection
// Сигнатуру цього класу змінювати не можна
class Container<T>(val value: T)

//