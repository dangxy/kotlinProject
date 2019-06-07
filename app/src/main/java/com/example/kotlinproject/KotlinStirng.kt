package com.example.kotlinproject


fun main(args: Array<String>) {


    val strVal = "hello"
    strVal.plus("world")
    strVal.reversed()

    println(strVal)
    println(strVal?.length)

    println("---------------------------------------------")

    var str = "hello"
    var length = str?.length
    var strRe = str.reversed()
    println(strRe)
    println(length)

    println("---------------------------------------------")

    var strPlus = str.plus("world")
    println(strPlus?.length)

    println("---------------------------------------------")


    /**
     * 1. !! 可以为空
     * 2. ? 不为空的时候
     * Exception in thread "main" kotlin.KotlinNullPointerException
     * at com.example.kotlinproject.KotlinStirngKt.main(KotlinStirng.kt:13)
     */

    var list: ArrayList<String>? = null
    var lengthNull = list?.size
    println(lengthNull)
    println("---------------------------------------------")



}
