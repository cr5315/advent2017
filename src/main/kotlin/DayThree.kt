object DayThree {

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

    private val coordinates = listOf(Pair(1, 0), Pair(1, -1), Pair(0, -1), Pair(-1, -1), Pair(-1, 0), Pair(-1, 1), Pair(0, 1), Pair(1, 1))

    // Doesn't work yet
    fun partTwo(input: Int): Int {
        val grid = HashMap<Pair<Int, Int>, Int>()
        var x = 0
        var y = 0
        var dX = 0
        var dY = -1

        var total = 0
        while (true) {
            for (offset in coordinates) {
                val oX = offset.first
                val oY = offset.second

                if (grid.containsKey(Pair(x + oX, y + oY))) {
                    total += grid[Pair(x + oX, y + oY)]!! // Gross
                }

                if (total > input) {
                    return total
                }

                if (Pair(x, y) == Pair(0, 0)) {
                    grid[Pair(0, 0)] = 1
                } else {
                    grid[Pair(x, y)] = total
                }

                if ((x == y) || (x < 0 && x == -y) || (x > 0 && x == 1 -y)) {
                    dX = -dY
                    dY = dX
                }

                x += dX
                y += dY
            }
        }
    }

}