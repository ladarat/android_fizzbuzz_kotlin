import com.sprinter.ronin.fizzbuzz.FizzBuzz

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class FizzBuzzTest {

    @Test
    @Throws(Exception::class)
    fun input1Print1() {
        val input = java.lang.Long.valueOf(1)
        val fizzbuzz = FizzBuzz()
        Assert.assertEquals("1", fizzbuzz.show(input))

    }

    @Test
    @Throws(Exception::class)
    fun input3PrintFizz() {
        val input = java.lang.Long.valueOf(3)
        val fizzbuzz = FizzBuzz()
        Assert.assertEquals("Fizz", fizzbuzz.show(input))

    }

    @Test
    @Throws(Exception::class)
    fun input5PrintBuzz() {
        val input = java.lang.Long.valueOf(5)
        val fizzbuzz = FizzBuzz()
        Assert.assertEquals("Buzz", fizzbuzz.show(input))

    }

    @Test
    @Throws(Exception::class)
    fun input15PrintFizzBuzz() {
        val input = java.lang.Long.valueOf(15)
        val fizzbuzz = FizzBuzz()
        Assert.assertEquals("FizzBuzz", fizzbuzz.show(input))

    }

}
