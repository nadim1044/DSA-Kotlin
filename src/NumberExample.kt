import NumberExample.findGCD
import NumberExample.findGCDEuclidean

object NumberExample {
    fun fibonacciRecursive(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            else -> fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
        }
    }

    fun fibonacciSeries(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            else -> fibonacciSeries(n - 1) + fibonacciSeries(n - 2)
        }
    }

    fun factorialNumber(n: Int): Int {
        var fact = 1
        for (i in 1..n) {
            fact *= i
            print("Fact: $i $fact\n")
        }
        print("Fact: $n\n")
        return fact
    }

    // Least Common Multiple 15 ,20 = 60
    fun findLCM(number1: Int, number2: Int): Int {
        var biggerValue = Math.max(number1, number2)
        val smallerValue = Math.min(number1, number2)
        val i = biggerValue;
        while (true) {
            if (biggerValue % smallerValue == 0) {
                return biggerValue
            }
            biggerValue += i
        }
    }

    /// Greatest Common Divisor / Highest Common Factor
    // Example 36 and 60 = 12
    fun findGCD(number1: Int, number2: Int): Int {

        var gcdValue = Math.min(number1, number2)
        while (gcdValue > 0) {
            if (number1 % gcdValue == 0 && number2 % gcdValue == 0) {
                return gcdValue
            }
            gcdValue--
        }
        return gcdValue
    }

    fun findGCDEuclidean(number1: Int, number2: Int): Int {
        var num1 = number1
        var num2 = number2
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2)
                num1 %= num2
            else
                num2 %= num1
        }
        if (num1 == 0)
            return num2
        return num1
    }
}

fun main() {
    NumberExample.also { numberExample: NumberExample ->

        numberExample.factorialNumber(10)
        numberExample.fibonacciRecursive(10)
        numberExample.fibonacciSeries(10)
        println(numberExample.findLCM(15, 20))
        println(findGCD(36, 60))
        println(findGCDEuclidean(36, 60))
    }
}

