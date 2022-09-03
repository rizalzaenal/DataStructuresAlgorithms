package algorithms

object BinarySearch {
    fun search(sortedList: Array<Int>, searchedValue: Int): Int? {
        var lowerBound = 0
        var upperBound = sortedList.size - 1

        if (searchedValue > sortedList[upperBound] || searchedValue < sortedList[lowerBound]) return null

        while (lowerBound <= upperBound) {
            val middleIndex = (lowerBound + upperBound) / 2
            if (sortedList[middleIndex] == searchedValue) {
                return middleIndex
            } else if (sortedList[middleIndex] < searchedValue) {
                lowerBound = middleIndex + 1
            } else if (sortedList[middleIndex] > searchedValue) {
                upperBound = middleIndex - 1
            }
        }
        return null
    }
}