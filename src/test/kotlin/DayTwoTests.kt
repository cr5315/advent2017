import org.junit.Assert.assertEquals
import org.junit.Test

class DayTwoTests {

    @Test
    fun partOneSample() {
        assertEquals(18, DayTwo.checksum("5\t1\t9\t5\n7\t5\t3\n2\t4\t6\t8"))
    }

    @Test
    fun partOne() {
        println(DayTwo.checksum(getResourceAsString("day02.txt")))
    }

    @Test
    fun partTwoSample() {
        assertEquals(9, DayTwo.divisible("5\t9\t2\t8\n9\t4\t7\t3\n3\t8\t6\t5"))
    }

    @Test
    fun partTwo() {
        println(DayTwo.divisible(getResourceAsString("day02.txt")))
    }
}