import algorithms.BinarySearch
import algorithms.BubbleSort
import algorithms.Recursions
import algorithms.SelectionSort
import java.util.Arrays

fun main(args: Array<String>) {

    val value = BinarySearch.search(arrayOf(1,2,3,4,5,6,7,8,9), 5)
    println("Index for searched value is $value")

    println(Arrays.toString(BubbleSort.sort(arrayOf(65, 55, 45, 35, 25, 15, 10))))
    println(Arrays.toString(SelectionSort.sort(arrayOf(65, 55, 45, 35, 25, 15, 10))))
    println(Recursions.factorial(5))
    Recursions.printNumbers(
        arrayOf(
            1,
            2,
            3,
            arrayOf(4, 5, 6),
            7,
            arrayOf(8, arrayOf(9, 10, 11, arrayOf(12, 13, 14))),
            15,
            16,
            17
        )
    )
}