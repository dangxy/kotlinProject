package com.example.kotlinproject

fun main(args: Array<String>) {
    var  test = Test()
    test.test1()

}

class  Test{
    var userName: String = "hello world"
    val str: String = "test"

    fun test1(){
        print("userName = $userName"+"str=$str")
    }

    companion object Student{
        var name :String = "zhangsan"
        var age : Int = 20

    }

}