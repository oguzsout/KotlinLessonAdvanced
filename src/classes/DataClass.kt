package classes


fun main() {
    val person = Person("Ali", 24)

    println("name= ${person.name}, age= ${person.age}")

    println("name= ${person.component1()}, age= ${person.component2()}")

    val person2 = person.copy("Emre")
    println("name= ${person2.name}, age= ${person2.age}")

}

data class Person(var name: String, var age: Int)