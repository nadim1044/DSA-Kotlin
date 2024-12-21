object Temp {

    fun getMinOperations(computationalTime: Array<Int>): Int {
        var opt = 0

        for (time in computationalTime) {
            var c = time
            while (c % 2 == 0) {
                c /= 2
                opt++
            }
        }

        return opt
    }

//    fun getMinOperations1(computationalTime: Array<Int>): Int {
//        var opt = 0
//
//        for (value in computationalTime) {
//            if (value % 2 != 0) {
//
//                while (true) {
//                    if (value == 1) {
//                        return opt
//                    }
//
//                    max /= 2
//                    opt++
//                }
//            }
//        }
//
//        var max = computationalTime.max()
//
//    }


    fun getMaxUnits(boxes: Array<Long>, unitsPerBox: Array<Long>, truckSize: Long): Long {
        val boxUnits = boxes.zip(unitsPerBox).sortedByDescending { it.second }
        println(boxUnits)
        var remaing = truckSize
        var total = 0L
        for ((boxCount, uniPerBox) in boxUnits) {
            val boxesToTake = minOf(remaing, boxCount)
            total += boxesToTake * uniPerBox
            remaing -= boxesToTake
            if (remaing == 0L) break
        }
        return total
    }
}

fun main() {
//    val a = getMinOperations1(arrayOf(3, 2, 24))
//    print(a)
}