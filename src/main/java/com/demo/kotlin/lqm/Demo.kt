package com.demo.kotlin.lqm

import kotlin.properties.Delegates

class Demo( name: String) {
    var name: String by DemoDelegate()

    var age: Int by Delegates.observable(0) {
        property, oldValue, newValue ->
        println("$property: $oldValue -> $newValue")
    }
}