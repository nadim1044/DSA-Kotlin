object ArrayProblems {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var output = IntArray(2)
        var map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val needNumber = target - nums.elementAt(i)
            if (map.containsKey(needNumber)) {
                val needNumberIndex = map[needNumber]
                println("Index : $i ${nums.elementAt(i)} $needNumber $needNumberIndex")

                output[0] = needNumberIndex ?: -1
                output[1] = i
            }
            map.put(nums.elementAt(i), i)
        }
        return output
    }
}

fun main() {
    println(ArrayProblems.twoSum(intArrayOf(11, 7, 11, 15, 2), 9).toList())
}