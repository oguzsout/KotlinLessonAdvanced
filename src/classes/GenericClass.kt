package classes

fun main() {
    var box = Box<Int>()
    box.add(5)

    var box2 = Box<Boolean>()
    box2.add(true)

    var myClass = MyClass<SecondClass>()
    myClass.myFunction(SecondClass())
}

class Box<T> {
    var s: T? = null

    fun add(s: T) {
        this.s = s
    }

    fun get(): T? = this.s
}

open class FirstClass {
    fun first() {}
}

class SecondClass : FirstClass() {
    fun second() {}
}

class ThirdClass : FirstClass() {
    fun third() {}
}

class MyClass<T : FirstClass> {
    fun myFunction(t: T) {

    }
}

class Producer<out T>(val value: T) {
    fun get(): T = value
}
class Consumer<in S>{
    fun toString(value:S): String{
        return value.toString()
    }
}