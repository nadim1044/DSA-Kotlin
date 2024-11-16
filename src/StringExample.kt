object StringExample {

    fun reversString(input:String) : String {
        var reversedString = ""
        for (i in input.length -1 downTo 0) {
            println(input.elementAt(i))
            reversedString += input.elementAt(i)
        }

        return  reversedString
    }
    
}

fun main() {
    println(StringExample.reversString("Nadim"))
}

