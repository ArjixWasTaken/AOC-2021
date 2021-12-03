fun main() {
    fun part1(input: List<String>): Int {
        var gamma = ""
        var epsilon = ""

        val counters =
                (0 until lines[0].length).map { i ->
                    val counter = mutableListOf(0, 0)

                    for (line in lines) {
                        if (line.isEmpty()) continue
                        counter[line[i].toString().toInt()] += 1
                    }
                    counter
                }

        for (j in counters) {
            if (j[0] > j[1]) {
                gamma += "0"
                epsilon += "1"
            } else {
                gamma += "1"
                epsilon += "0"
            }
        }
        return gamma.toInt(2) * epsilon.toInt(2)
    }

    val input = readInput("Day03_input")
    println(part1(input))
}
