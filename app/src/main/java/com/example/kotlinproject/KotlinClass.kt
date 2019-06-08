package com.example.kotlinproject


class Student constructor(private var name :String){


    private var age :Int  = 0
    private var address: String = ""

    init {
        this.name = name

        println("name = $name")
    }


    constructor(name: String, age: Int) : this(name) {

        this.age = age

        println("name = $name, age = $age")
    }

    constructor(name: String, age: Int, address: String) : this(name, age) {
        this.address = address


        println("name = $name, age = $age,address = $address")

    }


    fun getNameAndAge(name: String, age: Int = 234) {

        this.name = name

        println("name =$name,age = $age")

    }
}

fun main(args: Array<String>) {

    var student = Student("zhangSan",11,"BeiJing")

    student.getNameAndAge("LISI")


}