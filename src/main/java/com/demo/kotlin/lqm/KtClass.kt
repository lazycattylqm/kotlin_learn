package com.demo.kotlin.lqm

class KtClass constructor() {
    var name: String? = null
        get() {
            println("getter name")
            return field
        }
        set(value) {
            println("setter name")
            field = value
        }
    var age: Int = 10
        get() {
            println("getter age")
            return field
        }
        set(value) {
            println("setter age")
            field = value
        }

    constructor(name: String?) : this() {
        this.name = name
    }

    constructor(age: Int) : this() {
        this.age = age
    }

    public fun print(): Unit {
        println("name: $name, age: $age")
        privateFun()
    }

    private fun privateFun() {
        println("privateFun")
    }


}