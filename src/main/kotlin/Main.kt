import algorithms.BinarySearch

fun main(args: Array<String>) {

    val value = BinarySearch.search(arrayOf(1,2,3,4,5,6,7,8,9), 5)
    println("Index for searched value is $value")

}