fun main() {
    fun part1(input: List<Int>): Int {
    	var prev = Int.MAX_VALUE
    	return input.map{
		val bigger = if (it > prev) 1 else 0
		prev = it
		bigger
    	}.sum()
    }

    fun part2(input: List<Int>): Int {
    	val arr = input.toTypedArray()
       	return part1((0..(input.size-3)).map{arr[it] + arr[it+1] + arr[it+2]})
    }

    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day01_test")
    // check(part1(testInput) == 666)

    val input = readInput("Day01").map{it.toInt()}
    println(part1(input))
    println(part2(input))
}
