import org.junit.Assert.assertEquals
import org.junit.Test

class Day03Tests {

    @Test
    fun partOneSamples() {
        // assertEquals(0, Day03.partOne(1))
        assertEquals(3, Day03.partOne(12))
        assertEquals(2, Day03.partOne(23))
        assertEquals(31, Day03.partOne(1024))
    }

    @Test
    fun partOne() {
        println(Day03.partOne(312051))
    }

    @Test
    fun partTwo() {
        println(Day03.partTwo(312051))
    }
}