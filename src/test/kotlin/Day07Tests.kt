import org.junit.Assert.assertEquals
import org.junit.Test

class Day07Tests {

    @Test
    fun partOneSample() {
        assertEquals("tknk", Day07.partOne(getResourceAsString("day07sample.txt")))
    }

    @Test
    fun partOne() {
        println(Day07.partOne(getResourceAsString("day07.txt")))
    }

    @Test
    fun partTwoSample() {
        assertEquals(243, Day07.partTwo(getResourceAsString("day07sample.txt")))
    }

    @Test
    fun partTwo() {
        println(Day07.partTwo(getResourceAsString("day07.txt")))
    }
}