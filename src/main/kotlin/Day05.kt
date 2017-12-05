object Day05 {

    fun partOne(input: MutableList<Int>, print: Boolean = false): Int {
        var run = true
        var steps = 0
        var current = 0

        while (run) {
            try {
                val next = input[current]
                input[current]++
                current += next

                if (print) println("Step $steps: $input")
                steps++
            } catch (e: IndexOutOfBoundsException) {
                run = false
            }
        }


        return steps
    }

    fun partTwo(input: MutableList<Int>, print: Boolean = false): Int {
        var run = true
        var steps = 0
        var current = 0

        while (run) {
            try {
                val next = input[current]
                if (next >= 3) input[current]-- else input[current]++
                current += next

                if (print) println("Step $steps: $input")
                steps++
            } catch (e: IndexOutOfBoundsException) {
                run = false
            }
        }

        return steps
    }
}