package com.example.kotlinproject

fun main(args: Array<String>) {
    var  test = Test()
    test.test1()

    var x = 1 in 1..10

    println(x)

}

class  Test{
    var userName: String = "hello world"
    val str: String = "test"

    fun test1(){
        println("userName = $userName"+"str=$str")
    }

    companion object Student{
        var name :String = "zhangsan"
        var age : Int = 20

    }

}