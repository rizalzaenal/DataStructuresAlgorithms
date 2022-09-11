package algorithms

object SelectionSort {
    fun sort(unsortedArray: Array<Int>): Array<Int> {

        /**
         * create loop for looping from zero to second-last index of array
         */
        for (i in 0 until unsortedArray.size - 1) {
            /**
             * variable to keep track lowest value found from each loop
             * first value will be same as first index that start loop
             */
            var lowestValueIndex = i

            /**
             * create another loop from i + 1 to last index of array
             */
            for (j in i + 1 until unsortedArray.size) {

                /**
                 * if value in index j is smaller than value in index i
                 * change the lowestValueIndex variable to hold index j
                 */
                if (unsortedArray[j] < unsortedArray[i]) {
                    lowestValueIndex = j
                }
            }

            /**
             * after inner loop end, check if lowestValueIndex is not same as i,
             * that mean there is value lower than in index i
             * and do the swap value from lowestValueIndex goto index i, and vice versa
             */
            if (lowestValueIndex != i) {
                val temp = unsortedArray[i]
                unsortedArray[i] = unsortedArray[lowestValueIndex]
                unsortedArray[lowestValueIndex] = temp
            }

        }

        /**
         * return the sorted value
         */
        return unsortedArray
    }
}