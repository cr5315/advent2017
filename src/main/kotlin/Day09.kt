object Day09 {

    enum class State {
        ESCAPED, GARBAGE, NORMAL
    }

    fun partsOneAndTwo(input: String) {
        var counter = 0
        var score = 0
        var garbage = 0
        var state = State.NORMAL

        for (char in input) {
            when (state) {
                State.NORMAL -> {
                    when (char) {
                        '<' -> state = State.GARBAGE
                        '{' -> counter++
                        '}' -> score += counter--
                    }
                }
                State.GARBAGE -> {
                    when (char) {
                        '>' -> state = State.NORMAL
                        '!' -> state = State.ESCAPED
                        else -> garbage++
                    }
                }
                State.ESCAPED -> {
                    state = State.GARBAGE
                }
            }
        }

        println("Part 1: $score")
        println("Part 2: $garbage")
    }
}