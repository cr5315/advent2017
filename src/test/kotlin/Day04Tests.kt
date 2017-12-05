import org.junit.Assert.assertEquals
import org.junit.Test

class Day04Tests {

    @Test
    fun partOneSamples() {
        assertEquals(0, Day04.partOne("aa bb cc dd ee"))
        assertEquals(1, Day04.partOne("aa bb cc dd aa"))
        assertEquals(0, Day04.partOne("aa bb cc d aaa"))
    }

    @Test
    fun partOne() {
        println(Day04.partOne(getResourceAsString("day04.txt")))
    }

    @Test
    fun partTwoSamples() {
        assertEquals(1, Day04.partTwo("abcde fghij"))
        assertEquals(0, Day04.partTwo("abcde xyz ecda"))
    }

    @Test
    fun partTwo() {
        println(Day04.partTwo(getResourceAsString("day04.txt")))
    }
}