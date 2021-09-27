package functions

fun main() {

    /* val value = multiplyOne(8)
     println(value)

     */

    println(5.multiply())

    println("kotlin".reversed())

    val list = arrayListOf("Kotlin", "Java", "C#", "Javascript")
    list.swap(0, 3)
    for (item in list) println(item)
}
//fun multiplyOne(num : Int): Int = num * 3

fun Int.multiply() = this * 3

fun ArrayList<String>.swap(x: Int, y: Int) {
    val temp = this[x]
    this[x] = this[y]
    this[y] = temp
}

