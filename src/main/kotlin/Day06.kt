import java.util.*

object Day06 {

    fun partOne(input: ArrayList<Int>, debug: Boolean = false): Int {
        val previousResults = ArrayList<String>()
        var run = true
        var iterations = 0

        while (run) {
            val index = input.maxIndex()
            var indexValue = input[index]
            input[index] = 0

            var which = if (index == input.size - 1) 0 else index + 1
            while (indexValue > 0) {
                input[which]++

                which = if (which == input.size - 1) 0 else which + 1

                indexValue--
            }

            val result = input.toStringResult()
            if (debug) println(result)
            if (previousResults.contains(result)) run = false
            previousResults.add(result)

            iterations++
        }

        return iterations
    }

    fun partTwo(input: ArrayList<Int>, debug: Boolean = false): Int {
        val previousResults = ArrayList<String>()
        var reset = false
        var run = true
        var iterations = 0

        while (run) {
            val index = input.maxIndex()
            var indexValue = input[index]
            input[index] = 0

            var which = if (index == input.size - 1) 0 else index + 1
            while (indexValue > 0) {
                input[which]++

                which = if (which == input.size - 1) 0 else which + 1

                indexValue--
            }

            val result = input.toStringResult()
            if (debug) println(result)

            if (!reset && previousResults.contains(result)) {
                iterations = -1
                reset = true
            }

            if (Collections.frequency(previousResults, result) == 2) run = false
            previousResults.add(result)

            iterations++
        }

        return iterations
    }

    private fun ArrayList<Int>.maxIndex(): Int {
        var index = 0

        (0 until this.size)
                .asSequence()
                .filter { this[it] > this[index] }
                .forEach { index = it }

        return index
    }

    private fun ArrayList<Int>.toStringResult(): String {
        return this.joinToString(" ")
    }
}