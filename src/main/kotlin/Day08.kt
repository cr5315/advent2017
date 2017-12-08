object Day08 {
    private val INC = "inc"
    private val DEC = "dec"
    private val EQUAL = "=="
    private val NOT_EQUAL = "!="
    private val GREATER_THAN = ">"
    private val LESS_THAN = "<"
    private val GREATER_THAN_EQUAL = ">="
    private val LESS_THAN_EQUAL = "<="


    fun partsOneAndTwo(input: ArrayList<String>) {
        val registers = HashMap<String, Int>()

        var maxValue = 0

        for (line in input) {
            val command = line.split(" ")
            val register = command[0]
            val action = command[1]
            val value = command[2].toInt()

            val conRegister = command[4]
            val conAction = command[5]
            val conValue = command[6].toInt()

            if (!registers.containsKey(register)) registers.put(register, 0)
            if (!registers.containsKey(conRegister)) registers.put(conRegister, 0)

            var valid = false
            when (conAction) {
                EQUAL -> if (registers.getOrDefault(conRegister, 0) == conValue) valid = true
                NOT_EQUAL -> if (registers.getOrDefault(conRegister, 0) != conValue) valid = true
                GREATER_THAN -> if (registers.getOrDefault(conRegister, 0) > conValue) valid = true
                GREATER_THAN_EQUAL -> if (registers.getOrDefault(conRegister, 0) >= conValue) valid = true
                LESS_THAN -> if (registers.getOrDefault(conRegister, 0) < conValue) valid = true
                LESS_THAN_EQUAL -> if (registers.getOrDefault(conRegister, 0) <= conValue) valid = true
            }

            if (valid) {
                if (action == INC) registers[register] = registers.getOrDefault(register, 0) + value
                if (action == DEC) registers[register] = registers.getOrDefault(register, 0) - value

                if (registers.getOrDefault(register, 0) > maxValue) maxValue = registers.getOrDefault(register, 0)
            }
        }

        println(registers.maxBy { it.value }!!.value)
        println(maxValue)
    }
}