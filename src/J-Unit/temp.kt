import java.*
import java.util.*

internal object FahrenheitToCelsius {
    @JvmStatic
    fun main(args: Array<String>) {
        var temperature: Float
        val `in` = Scanner(System.`in`)

        println("Enter temperature in Fahrenheit")
        temperature = `in`.nextInt().toFloat()

        temperature = (temperature - 32) * 5 / 9

        println("temperature in Celsius = $temperature")
    }
}