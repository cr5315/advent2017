import org.junit.Assert.assertEquals
import org.junit.Test

class Day01Tests {

    @Test
    fun partOneSamples() {
        assertEquals(3, Day01.sum("1122"))
        assertEquals(4, Day01.sum("1111"))
        assertEquals(0, Day01.sum("1234"))
        assertEquals(9, Day01.sum("91212129"))
    }

    @Test
    fun partOne() {
        println(Day01.sum(getResourceAsString("day01.txt")))
    }

    @Test
    fun partTwoSamples() {
        assertEquals(6, Day01.sum2("1212"))
        assertEquals(0, Day01.sum2("1221"))
        assertEquals(4, Day01.sum2("123425"))
        assertEquals(12, Day01.sum2("123123"))
        assertEquals(4, Day01.sum2("12131415"))
    }

    @Test
    fun partTwo() {
        println(Day01.sum2(getResourceAsString("day01.txt")))
    }
}