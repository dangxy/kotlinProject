package com.example.kotlinproject

fun main(args: Array<String>) {



    var items = listOf("apple","banana","fruit")

    for (item in items){
        println(item)
    }

    println("---------------------------------------------")

    for (x in 1..10) {
        println(x)
    }

    println("---------------------------------------------")

    for (x in 1..10 step 2){
        println(x)
    }

    println("---------------------------------------------")

    for(x in 9 downTo 0 step 3){
        println(x)
    }

    println("---------------------------------------------")

}

