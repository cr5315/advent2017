import org.junit.Assert.assertEquals
import org.junit.Test

class DayThreeTests {

    @Test
    fun partOneSamples() {
        // assertEquals(0, DayThree.partOne(1))
        assertEquals(3, DayThree.partOne(12))
        assertEquals(2, DayThree.partOne(23))
        assertEquals(31, DayThree.partOne(1024))
    }

    @Test
    fun partOne() {
        println(DayThree.partOne(312051))
    }

    @Test
    fun partTwo() {
        println(DayThree.partTwo(312051))
    }
}