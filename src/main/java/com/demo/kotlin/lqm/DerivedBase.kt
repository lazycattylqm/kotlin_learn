package com.demo.kotlin.lqm

class DerivedBase(b: Base) : Base by b {
    override fun defaultMethod() {
        println("this is derived class")
    }
}