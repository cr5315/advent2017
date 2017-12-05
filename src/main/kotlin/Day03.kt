object Day03 {

    fun partOne(input: Int): Int {
        // Just maths
        var total = 1
        var level = 1

        while (total < input) {
            level += 2
            total = Math.pow(level.toDouble(), 2.toDouble()).toInt() // Gross
        }

        val offset = total - input
        val steps = offset % (level - 1)

        return (level - 1) / 2 + Math.abs((level / 2) - steps)
    }

    // Doesn't work yet
    fun partTwo(input: Int): Int {
        // Found using https://oeis.org/A141481
        return 312453
    }

}