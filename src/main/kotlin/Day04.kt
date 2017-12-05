object Day04 {

    fun partOne(input: String): Int {
        return input.lines().map { it.split(" ") }
                .count { it.size == it.toSet().size }
    }

    fun partTwo(input: String): Int {
        return input.lines().map { it.split(" ")
                .map { it.sort() }}
                .count { it.size == it.toSet().size }
    }

    private fun String.sort(): String {
        val carr = this.toCharArray()
        carr.sort()
        return String(carr)
    }
}