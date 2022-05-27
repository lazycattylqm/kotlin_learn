package com.demo.kotlin

import com.demo.kotlin.lqm.DataKtClass
import com.demo.kotlin.lqm.KtClass
import com.demo.kotlin.lqm.SAMInterface

fun main() {
    println("Hello, world!")
    val ktClass = KtClass()
    ktClass.age = 100
    ktClass.name = "lqm"
    ktClass.print()
    val tempPractice = KtClass()
    tempPractice.tempPractice()
    val sam = SAMInterface { it > 12 }
    println(sam.test(100))
    println(sam.test(1))
    fun KtClass.broadcast() {
        println("this is broadcast")
        this.print()
    }
    ktClass.broadcast()
    DataKtClass("fengxiaoling", 31).print()
}