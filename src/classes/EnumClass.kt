package classes

fun main() {
    dayCalculate(Days.SUNDAY,5)
println(dayCalculate(Days.FRIDAY,2))
}

fun dayCalculate(day: Days, value: Int): Int =
    when (day) {
        Days.SUNDAY -> value + 10
        Days.MONDAY -> value + 5
        Days.TUESDAY -> value * 5
        Days.WEDNESDAY -> value
        Days.THURSDAY -> value - 5
        Days.FRIDAY -> value * value
        Days.SATURDAY -> value - 2
        else -> -1

    }

enum class Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY

}
