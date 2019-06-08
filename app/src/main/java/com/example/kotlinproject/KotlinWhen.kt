package com.example.kotlinproject


fun main(args: Array<String>) {

    getType(1)
    var x = 1
    var mode = when{
        x == 1 -> "false"
        else -> "true"
    }
    println(mode)

   println(getTypeByName(3))

}

fun getType(type: Int) {
    when (type) {
        1 -> println("1")
        2-> println("2")
        3-> println("3")
    }
}
fun getTypeByName(type: Int): String {
    return when (type) {
        1 -> "worlds1"
        2 -> "worlds2"
        else -> "world"
    }
}


fun describe(obj: Any): String =
    when (obj) {
        1 -> "one"
        else -> "unknown"
    }
