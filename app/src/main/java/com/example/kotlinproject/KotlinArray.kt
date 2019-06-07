package com.example.kotlinproject

fun main(args: Array<String>) {

    /**
     * 不可变集合listOf
     *
     */
    val list :List<String> = listOf("1","2","3")


    list.forEach { println(it) }

    println("---------------------------------------------")

    var mutableListNew =  list.toMutableList()

    mutableListNew.add("hello")
    mutableListNew.add("hello1")
    mutableListNew.add("hello2")

    mutableListNew.forEach { println(it) }

    println("---------------------------------------------")

    var mutableList = mutableListOf<String>()
    mutableList.add("hello4")
    mutableList.add("hello5")
    mutableList.add("hello6")

    mutableList.forEach { println(it) }

    println("---------------------------------------------")

    /***
     * 1.  可变集合ArrayLis的两种方式
     *
     */
    var arrayList2 : ArrayList<String> = arrayListOf()
    arrayList2.add("hello7")
    arrayList2.add("hello8")
    arrayList2.add("hello9")
    arrayList2.forEach { println(it) }

    println("---------------------------------------------")

    var arrayList :ArrayList<String> = ArrayList()
    arrayList.add("hello10")
    arrayList.add("hello11")
    arrayList.add("hello12")

    arrayList.forEach { println(it) }

    println("---------------------------------------------")

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }


}
