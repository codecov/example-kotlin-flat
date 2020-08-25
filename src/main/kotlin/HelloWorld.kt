package org.jacoco.examples.gradle.kotlin

class HelloWorld {
    fun getMessage(bigger: Boolean): String {
        return if (bigger) {
            "Hello Universe!";
        } else {
            "Hello World!";
        }
    }
}