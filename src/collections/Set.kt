package collections

fun main() {
    // Set, verileri -unique- tek olarak barındırır.

    /*var set = setOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,10) //immutable
    println(set.size)

     */

    var set2 = mutableSetOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,10) //mutable
    set2.add(12)
    set2.add(12)

    for (item in set2) println(item)
    set2.remove(5)
    println(set2)

    var set3 = hashSetOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,10)
    println()
    for (item in set3) println(item)

}