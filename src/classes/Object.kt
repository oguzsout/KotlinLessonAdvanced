package classes

fun main() {
    val result = MyObject.multiply(3, 5)
    println(result)

    val person = object : Personality(){
        override fun writeCode() {
            println("I don't write code")
        }
    }
    person.eat()
    person.talk()
    person.writeCode()
}

object ExampleObject {
    // property
    // method
}

object MyObject {
    var a: Int = 0
    var b: Int = 1

    fun multiply(x: Int, y: Int): Int = x * y
}
open class Personality(){

    fun eat() = println("Eating food")
    fun talk() = println("Talking people")

    open fun writeCode() = println("Writing Code")
}