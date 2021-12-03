fun main() {
    fun part1(input: List<String>): Int {
      var pos = 0
      var depth = 0

      for (line in input) {
          val (command, steps) = line.split(" ")

          when (command) {
              "forward" -> {
                  pos += steps.toInt()
              }
              "down" -> {
                  depth += steps.toInt()
              }
              "up" -> {
                  depth -= steps.toInt()
              }
              else -> {}
          }
      }
      return pos * depth
  }
    
  fun part2(input: List<String>): Int {
      var pos = 0
      var depth = 0
      var aim = 0

      for (line in input) {
          val (command, steps) = line.split(" ")

          when (command) {
              "forward" -> {
                  pos += steps.toInt()
                  depth += aim * steps.toInt()
              }
              "down" -> {
                  aim += steps.toInt()
              }
              "up" -> {
                  aim -= steps.toInt()
              }
              else -> {}
          }
      }
      return pos * depth
  }
  val input = readInput("Day02_input")
  println(part1(input))
  println(part2(input))
}
