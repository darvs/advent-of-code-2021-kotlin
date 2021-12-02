fun main() {
    fun part1(input: List<Pair<String, Int>>): Int {
    	var pos: Int = 0
	var depth: Int = 0

	input.forEach{
		val action = it.first
		val value = it.second

		when(action) {
			"down" -> depth += value
			"up" -> depth -= value
			"forward" -> pos += value
			}
	}

	return pos * depth
    }

    fun part2(input: List<Pair<String, Int>>): Int {
    	var aim: Int = 0
    	var pos: Int = 0
	var depth: Int = 0

	input.forEach{
		val action = it.first
		val value = it.second

		when(action) {
			"down" -> aim += value
			"up" -> aim -= value
			"forward" -> {
				pos += value
				depth += aim * value
				}
			}
	}

	return pos * depth
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("2102.smol.in").map{
    	val v = it.split(" ")
	Pair(v[0], v[1].toInt())
    }

    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("2102.in").map{
    	val v = it.split(" ")
	Pair(v[0], v[1].toInt())
    }

    println(part1(input))
    println(part2(input))
}
