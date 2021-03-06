fun main() {
    fun part1(input: List<String>): Int {
        var increasements = 0
        var lastDepth: Int? = null

        for (line in getLines()) {
            if (line.isNotEmpty()) {
                if (lastDepth == null) {
                    lastDepth = line.toInt()
                    continue
                }

                if (line.toInt() > lastDepth!!) {
                    ++increasements
                }
                lastDepth = line.toInt()
            }
        }
        return increasements
    }

    fun part2(input: List<String>): Int {
        var increasements = 0
        val lines = getLines()

        for (i in 2 until lines.size - 1) {
            val groupA = lines[i - 2].toInt() + lines[i - 1].toInt() + lines[i].toInt()
            val groupB = lines[i - 1].toInt() + lines[i].toInt() + lines[i + 1].toInt()

            if (groupA < groupB) {
                ++increasements
            }
        }
        return increasements
    }

    val input = readInput("Day01_input")
    println(part1(input))
    println(part2(input))
}
