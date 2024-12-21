object StringExample {

    fun reversString(input: String): String {
        var reversedString = ""
        for (i in input.length - 1 downTo 0) {
            println(input.elementAt(i))
            reversedString += input.elementAt(i)
        }

        return reversedString
    }

    fun canChange(start: String, target: String): Boolean {

        var left = start.length - 1
        var right = 0
        val newStart = StringBuilder(start)
        // "_L__R__R_", "L______RR"
        // "012345678"
        // RR_
        start.forEachIndexed { _, _ ->

            println("${newStart.elementAt(right)} $right : ${newStart.elementAt(left)} $left")
            if (newStart.elementAt(left) == '_' || newStart.elementAt(right) == '_') {

                var leftInternalIndex = left
                while (leftInternalIndex >= 0) {
                    if (newStart.elementAt(leftInternalIndex) == 'R') {
                        newStart[left] = 'R'
                        newStart[leftInternalIndex] = '_'
                        break
                    } else if (newStart.elementAt(leftInternalIndex) == 'L') {
                        break
                    }
                    leftInternalIndex--
                }

                var rightInternalIndex = right
                while (rightInternalIndex < start.length) {
                    if (newStart.elementAt(rightInternalIndex) == 'L') {
                        newStart[right] = 'L'
                        newStart[rightInternalIndex] = '_'
                        break
                    } else if (newStart.elementAt(rightInternalIndex) == 'R') {
                        break
                    }
                    rightInternalIndex++
                }
            }
            right++
            left--

        }

        println(newStart)
        return false
    }

}

fun main() {
//    println(StringExample.reversString("Nadim"))
    StringExample.canChange("_L__R__R_", "L______RR");
}

