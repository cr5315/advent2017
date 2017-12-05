import org.junit.Assert.assertEquals
import org.junit.Test

class Day05Tests {

    @Test
    fun part1Sample() {
        assertEquals(5, Day05.partOne(mutableListOf(0, 3, 0, 1, -3), true))
    }

    @Test
    fun part1() {
        val input = getResourceAsString("day05.txt").lines().map { it.toInt() }.toMutableList()
        println(Day05.partOne(input))
    }

    @Test
    fun part2Sample() {
        assertEquals(10, Day05.partTwo(mutableListOf(0, 3, 0, 1, -3), true))
    }

    @Test
    fun part2() {
        val input = getResourceAsString("day05.txt").lines().map { it.toInt() }.toMutableList()
        println(Day05.partTwo(input))
    }
}