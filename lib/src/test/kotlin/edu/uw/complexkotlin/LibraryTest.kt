/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package edu.uw.complexkotlin

import kotlin.test.*

//Etra Credit: Teat FizzBuzz when the number is evenly divisible by 7 (DOH!)
class LibraryTest {
    @Test fun fizzbuzzToTwo() {
        assertEquals("", fizzbuzz(1..2))
    }
    @Test fun fizzbuzzToThree() {
        assertEquals("FIZZ", fizzbuzz(1..3))
    }
    @Test fun fizzbuzzToSix() {
        assertEquals("FIZZBUZZFIZZ", fizzbuzz(1..6))
    }
    @Test fun fizzbuzzToSeven() {
        assertEquals("FIZZBUZZFIZZDOH!", fizzbuzz(1..7))
    }
    @Test fun fizzbuzzToTwelve() {
        assertEquals("FIZZBUZZFIZZDOH!FIZZBUZZFIZZ", fizzbuzz(1..12))
    }
    @Test fun fizzbuzzToFifteen() {
        assertEquals("FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZ", fizzbuzz(1..15))
    }
    // Fizzbuzz to 25 should equal "FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZ"
    // Fizzbuzz to 50 should equal "FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZ"

    //Extra Credit: test FizzBuzz out to 50
    @Test fun fizzbuzzToFifty() {
        assertEquals("FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZDOH!FIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZDOH!BUZZ", fizzbuzz(1..50))
    }

    //Extra Credit: test FizzBuzz out to 100
     @Test fun fizzbuzzToOneHundred() {
        assertEquals("FIZZBUZZFIZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZDOH!FIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZDOH!BUZZFIZZFIZZBUZZDOH!FIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZDOH!FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZDOH!FIZZBUZZFIZZDOH!FIZZBUZZ", 
        fizzbuzz(1..100))
    }

    //@Test fun fizzbuzzgenToFifteen() {
    //    val fb = fizzbuzzgen(mapOf(3 to "FIZZ", 5 to "BUZZ"))
    //    assertEquals("FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZ", fb(1..15))
    //}

    @Test fun r1Test() {
        assertEquals(">>> FOO: {BAR}", r1())
    }
    @Test fun r2Test() {
        assertEquals(">>> FOO: {WOOGAWOOGAWOOGA}", r2())
    }

    @Test fun philosopherTests() {
        var seneca = Philosopher.THINKING
        assertEquals("Deep thoughts....", seneca.toString())

        // Shift to talking
        seneca = seneca.signal()
        assertEquals("Allow me to suggest an idea...", seneca.toString())

        // Shift to thinking
        seneca = seneca.signal()
        assertEquals("Deep thoughts....", seneca.toString())

        // Shift back to talking
        seneca = seneca.signal()
        assertEquals("Allow me to suggest an idea...", seneca.toString())
    }

    @Test fun commandTests() {
        assertEquals("", Command("")(""))
        assertEquals("> Hello!", Command("> ")("Hello!"))
    }
}
