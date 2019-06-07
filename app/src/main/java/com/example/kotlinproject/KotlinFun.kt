package com.example.kotlinproject



fun main(args: Array<String>) {
    var typeOverLoad = TypeOverLoad()
    TypeOverLoad.type("HELLO")
    typeOverLoad.type("hello",1)


    TypeOverLoad.Student.age= 12
    TypeOverLoad.Student.name = "world"

    StaticMethod.age
    StaticMethod.name


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

class StaticMethod{
    companion object{
        const val name = "HELLO"
        const val age = 11
    }
}
