
interface Movable
interface Walkable

open class Animal

class Dog(val movable: Movable, val walkable: Walkable): Animal()

class Cat: Animal()

fun main() {


}
