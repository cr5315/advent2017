import org.junit.Assert.assertEquals
import org.junit.Test

class Day06Tests {

    @Test
    fun partOneSample() {
        assertEquals(5, Day06.partOne(arrayListOf(0, 2, 7, 0), true))
    }

    @Test
    fun partOne() {
        println(Day06.partOne(arrayListOf(5, 1, 10, 0, 1, 7, 13, 14, 3, 12, 8, 10, 7, 12, 0, 6)))
    }

    @Test
    fun partTwoSample() {
        assertEquals(4, Day06.partTwo(arrayListOf(0, 2, 7, 0), true))
    }

    @Test
    fun partTwo() {
        println(Day06.partTwo(arrayListOf(5, 1, 10, 0, 1, 7, 13, 14, 3, 12, 8, 10, 7, 12, 0, 6)))
    }
}