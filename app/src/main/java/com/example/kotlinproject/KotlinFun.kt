package com.example.kotlinproject

import android.support.annotation.NonNull


fun main(args: Array<String>) {
    var typeOverLoad = TypeOverLoad()
    TypeOverLoad.type("HELLO")
    typeOverLoad.type("hello", 1)


    TypeOverLoad.Student.age = 12
    TypeOverLoad.Student.name = "world"

    StaticMethod.age
    StaticMethod.name


    println(paseInt("WWW"))


}

open class TypeOverLoad {
    open fun type(name: String, age: Int) {
        println("name = $name =+age = $age")
    }

    companion object {
        fun type(name: String) {
            println("name = $name")
        }
    }

    object Student {
        var name = "hello"
        var age = 11
    }
}

class StaticMethod {
    companion object {
        const val name = "HELLO"
        const val age = 11
    }
}

fun sum(a: Int, b: Int): Int {

    return a + b
}

fun sum1 (a :Int ,b :Int) = a+b


/**
 * 无返回类型 Unit 可以省略不写
 */
fun printSun(a: Int ,b :Int):Unit{
    println("sum of $a and $b is ${a +b}" )
}

const val name = "zhangsan"

fun maxOf(a: Int, b: Int) = if (a > b) a else b


fun paseInt (str : String) :Int?{

    return  str.toIntOrNull()
}

fun getStringLength(obj :Any) :Int?{
    if(obj is String){
        return  obj.length
    }
    return null
}





