package collections

fun main() {
    // key - value
   /* var map = mapOf<Int,String>()//Immutable
    var map2 = mapOf<Int,String>(10 to "Ahmet",20 to "Ali",30 to "Bahar",40 to "Dilara")

    for (key in map2.keys) println("Key: $key  Value: ${map2[key]}" )

    */

    //MutableMaps

        var map3 = HashMap<Int,String>() //-> mutable,dinamik
        map3[1] = "Ali" //-> put keyword
        map3[2] = "Ahmet"
        map3[3] = "Bahar"
        map3[4] = "Dilara"
   // for (key in map3.keys) println("Key: $key  Value: ${map3[key]}" )

    map3.replace(2,"Melih")
    for (key in map3.keys) println("Key: $key  Value: ${map3[key]}" )

}