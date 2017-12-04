import org.junit.Assert.assertEquals
import org.junit.Test

class DayFourTests {

    @Test
    fun partOneSamples() {
        assertEquals(0, DayFour.partOne("aa bb cc dd ee"))
        assertEquals(1, DayFour.partOne("aa bb cc dd aa"))
        assertEquals(0, DayFour.partOne("aa bb cc d aaa"))
    }

    @Test
    fun partOne() {
        println(DayFour.partOne(getResourceAsString("day04.txt")))
    }

    @Test
    fun partTwoSamples() {
        assertEquals(1, DayFour.partTwo("abcde fghij"))
        assertEquals(0, DayFour.partTwo("abcde xyz ecda"))
    }

    @Test
    fun partTwo() {
        println(DayFour.partTwo(getResourceAsString("day04.txt")))
    }
}