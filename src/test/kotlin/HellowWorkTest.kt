package org.jacoco.examples.gradle.kotlin

import org.junit.Assert
import org.junit.Test

class HelloWorldTest {

    @Test
    fun testAssert() {
        Assert.assertEquals("Hello World!", HelloWorld().getMessage(false))
    }
}