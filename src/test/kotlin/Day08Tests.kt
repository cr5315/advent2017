import org.junit.Test

class Day08Tests {


    @Test
    fun partsOneAndTwo() {
        println(Day08.partsOneAndTwo(ArrayList(getResourceAsString("day08.txt").lines())))
    }
}