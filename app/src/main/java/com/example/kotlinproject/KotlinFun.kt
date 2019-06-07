package com.example.kotlinproject



fun main(args: Array<String>) {
    var typeOverLoad = TypeOverLoad()
    TypeOverLoad.type("HELLO")
    typeOverLoad.type("hello",1)


    TypeOverLoad.obj.age= 12
    TypeOverLoad.obj.name = "world"

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
    object obj {
        var name = "hello"
        var age = 11
    }
}
