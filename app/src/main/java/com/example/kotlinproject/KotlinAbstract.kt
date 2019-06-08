package com.example.kotlinproject


abstract class Person {
    abstract var address: String
    private var name: String = ""

    open fun getName(name: String) {
        this.name  = name
        println("Person = name = ${this.name}")

    }
}


class Man :Person() {
    override var address: String = ""

    override fun getName(name: String) {
        super.getName(name)

        println("Man = name = $name")
    }
}

fun main(args: Array<String>) {
    var man = Man()
    man.getName("zhangSan")
}