package algorithms

object BubbleSort{
    fun sort(unsortedArray: Array<Int>): Array<Int> {
        /**
         * set until which index array not been sorted, at first at last index
         * because we assume array is completely unsorted
         */
        var unsortedUntilIndex = unsortedArray.size - 1

        /**
         *flag for keep track if array has been all sorted or not,
         * if there is any swap mean array not sorted yet
         */
        var isSorted = false

        /**
         * keep looping if isSorted still false
         */
        while (!isSorted) {
            /**
             * set isSorted to true before doing
             * for loop
             */
            isSorted = true

            /**
             * loop from index zero until unsortedUntilIndex
             */
            for (i in 0 until unsortedUntilIndex) {
                /**
                 * if from left side bigger than right side,
                 * swap the value
                 */
                if (unsortedArray[i] > unsortedArray[i+1]) {
                    val iIndexValue = unsortedArray[i]
                    unsortedArray[i] = unsortedArray[i+1]
                    unsortedArray[i+1] = iIndexValue
                    /**
                     * set isSorted to false because swap happen
                     */
                    isSorted = false
                }
            }
            /**
             * substract unsortedUntilIndex value with one
             * because one looping happen, and we can be sure that
             * biggest value already at the right most of the index
             */
            unsortedUntilIndex -= 1
        }
        /**
         * return sorted array
         */
        return unsortedArray
    }
}