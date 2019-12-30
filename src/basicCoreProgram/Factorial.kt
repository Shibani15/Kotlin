fun main(args:Array<String>)
{
    var number=5
   var result:Long
    result=factorial(number)


}

fun factorial(n:Int): Long {
    return if (n == 1) {
        n.toLong()
    } else {
        n * factorial(n - 1)
    }
}
