fun main(args:Array<String>) {
    var myArray1 = arrayOf(3, -1, 7, -4, -5, 9, 10)
    for (i in myArray1) {
        var i = 0
        var firstNumber = myArray1[i]
        for (j: Int in myArray1[i + 1]) {
            var secondNumber = myArray1[i + 1]
            for (k: Int in myArray1[i + 2])
            var thirdNumber: Int = myArray1[i + 2]
            var sum = firstNumber + secondNumber + thirdNumber
            println(sum)
        }
        }
    }



}

private operator fun Int.iterator(): Iterator<Int> {

}
