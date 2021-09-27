package functions

/*
Bütün infix fonksiyonlar extension fonksiyondur ancak bütün extension fonksiyonlar infix değildir.
Infix fonksiyonlar tek parametre alır.
 */
fun main() {

    5 downTo 1
    5.downTo(1)//Extension

    val value = 4 sum 5
    println(value)

    println("Kotlin" concat "Android")
}
infix fun Int.sum(num : Int): Int = this + num

infix fun String.concat(other:String): String = this + other