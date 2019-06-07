package com.example.kotlinproject

open class  Parent{
   open fun name(){
       println("parent")
    }
}

class Child : Parent(){
    override fun name(){
        super.name()
        println("child")
    }

}

interface Grand{
    fun name(){
        println("grand")
    }
}


class  Child2 : Parent(),Grand{
    override fun name() {
        super<Grand>.name()
        super<Parent>.name()
        println("child")
    }
}
fun main(args: Array<String>) {
    var child = Child()
    //  child.name()

    var child2 = Child2()
    child2.name()
}