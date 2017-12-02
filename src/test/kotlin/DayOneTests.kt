import org.junit.Assert.assertEquals
import org.junit.Test

class DayOneTests {

    @Test
    fun partOneSamples() {
        assertEquals(3, DayOne.sum("1122"))
        assertEquals(4, DayOne.sum("1111"))
        assertEquals(0, DayOne.sum("1234"))
        assertEquals(9, DayOne.sum("91212129"))
    }

    @Test
    fun partOne() {
        println(DayOne.sum(getResourceAsString("day01.txt")))
    }

    @Test
    fun partTwoSamples() {
        assertEquals(6, DayOne.sum2("1212"))
        assertEquals(0, DayOne.sum2("1221"))
        assertEquals(4, DayOne.sum2("123425"))
        assertEquals(12, DayOne.sum2("123123"))
        assertEquals(4, DayOne.sum2("12131415"))
    }

    @Test
    fun partTwo() {
        println(DayOne.sum2(getResourceAsString("day01.txt")))
    }
}