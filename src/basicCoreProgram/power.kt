fun main(args: Array<String>)
{
    val base = 2
    var exponent = 4
    var result: Long = 1
    while (exponent != 0) {
        result *= base.toLong()
        --exponent
    }
    println("Answer = $result")
}