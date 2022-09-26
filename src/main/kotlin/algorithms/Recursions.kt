package algorithms

object Recursions {

    fun factorial(number: Int): Int {

        if (number == 1) {
            /**
             * base case
             */
            return 1
        } else {
            return number * factorial(number - 1)
        }
    }

    fun printNumbers(numbers: Array<Any>) {

        for (number in numbers) {
            if (number is Int) {
                println(number)
            } else if (number is Array<*>) {
                printNumbers(number as Array<Any>)
            }
        }

    }

    fun stringReversal(input: String): String {
        if (input.length == 1) return input[0].toString()

        return  stringReversal(input.substring(1)) + input[0]
    }

    fun isPalindrome(input: String): Boolean {
        if (input.length == 0 || input.length == 1) return true

        if (input[0] == input[input.length - 1]) {
            return isPalindrome(input.substring(1, input.length - 1))
        }

        return false
    }

    fun decimalToBinary(decimal: Int, result: String = ""): String {
        if (decimal == 0) return result

        val binary = (decimal % 2).toString() + result

        return decimalToBinary(decimal / 2, binary)
    }

    fun sumNaturalNumbers(number: Int): Int {
        if (number == 1) return 1

        return sumNaturalNumbers(number - 1) + number
    }
}