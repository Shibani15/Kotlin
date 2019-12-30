import kotlin.math.pow
import kotlin.math.sqrt

fun distanceBetweenPoints()
{
    val p1= Pair(4,0)
    val p2= Pair(6,6)
    println("point p1:&{p1[0]},${p1.first}")
    println("point p2:&{p2[0]},${p2.first}")
    val distance= sqrt((p1.first - p2.first.toDouble().pow(2.0)))
    (p1.second - p2.second.toDouble().pow(2.0))
    println(distance)


}