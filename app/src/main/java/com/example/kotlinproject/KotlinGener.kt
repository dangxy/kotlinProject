package com.example.kotlinproject

fun main(args: Array<String>) {

    var box: Box<Int> = Box<Int>(1)
    var box1:Box<String> = Box<String>("zhangSan");


    val demo = Outer().Inner().foo()

    Direction.EAST

}

class Box<T> (t :T){
    var value = t
}

class Outer{
    private val bar :Int = 1
    inner class Inner{
        fun foo() = bar
    }
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}