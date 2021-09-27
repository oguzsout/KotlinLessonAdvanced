package functions

fun main() {
    printRepeat("Hello World", 10)

    var list = arrayOf(1, 2, 3, 4, 5)
    var list2 = arrayOf("Kotlin", "Java", "C#", "Javascript")
    var list3 = arrayOf(2.6, 3.5, 4.8, 3.14)

    printArray(list)
    printArray(list2)
    printArray(list3)



    list.printArrayExt()
    list2.printArrayExt()
    list3.printArrayExt()
}

fun <T> printRepeat(t: T, k: Int) {
    for (items in 0..k) println(t)
}

fun <T> printArray(myArray: Array<T>) {
    for (items in myArray) println(items)
}

fun <T> Array<T>.printArrayExt() {
    for (items in this) println(items)
}