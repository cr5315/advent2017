object DayTwo {

    // Part 1
    fun checksum(input: String): Int {
        return input.lines()
                .map { line ->
                    line.split("\t").map { it.toInt() } // Evil tab character
                }
                .sumBy {
                    it.max()!! - it.min()!! // Evil !! operator
                }

    }

    // Part 2
    fun divisible(input: String): Int {
        return input.lines()
                .map { line ->
                    line.split("\t").map { it.toInt() }
                }
                .sumBy { line ->
                    for (item in line) {
                        line
                                .filter { item != it }
                                .forEach {
                                    if (item % it == 0) {
                                        return item / it
                                    }
                                }
                    }

                    0 // Else 0
                }
    }
}