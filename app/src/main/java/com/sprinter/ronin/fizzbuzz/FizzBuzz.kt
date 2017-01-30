package com.sprinter.ronin.fizzbuzz

class FizzBuzz {

    fun show(number: Long?): String {

        if (number!! % 15 == 0L) {
            return "FizzBuzz"
        }

        if (number % 3 == 0L) {
            return "Fizz"
        }

        if (number % 5 == 0L) {
            return "Buzz"
        }

        return java.lang.Long.toString(number)
    }
}
