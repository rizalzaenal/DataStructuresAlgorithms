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

}