package com.demo.kotlin

import com.demo.kotlin.lqm.KtClass

fun main() {
    println("Hello, world!")
    val ktClass = KtClass()
    ktClass.age = 100
    ktClass.name = "lqm"
    ktClass.print()
    val tempPractice = KtClass()
    tempPractice.tempPractice()
}