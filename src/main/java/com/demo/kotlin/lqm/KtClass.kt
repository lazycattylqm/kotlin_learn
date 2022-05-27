package com.demo.kotlin.lqm

class KtClass constructor(): TempPractice {
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

    fun print() {
        println("name: $name, age: $age")
        privateFun()
    }

    private fun privateFun() {
        println("privateFun")
    }

    override fun tempPractice() {
        println("this is implement of tempPractice, Kt class")
    }


}