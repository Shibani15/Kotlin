import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

internal object PalindromeTest {

    @JvmStatic
    fun main(args: Array<String>) {

        print("Enter any string:")
        val `in` = Scanner(System.`in`)
        val inputString = `in`.nextLine()
        val queue = "MADAM"

        for (i in inputString.length - 1 downTo 0) {
           var queue=(inputString[i])
        }

        var reverseString = ""


        if (inputString == reverseString)
            println("The input String is a palindrome.")
        else
            println("The input String is not a palindrome.")

    }
}