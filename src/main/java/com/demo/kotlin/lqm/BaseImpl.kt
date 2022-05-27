package com.demo.kotlin.lqm

class BaseImpl : Base {
    override fun print() {
        println("this is base impl")
    }

    override fun defaultMethod() {
        super.defaultMethod()
        println("this is override default method")
    }
}