package com.bridgelabz.junittest

import java.util.Scanner

object DayofWeek {

    fun dayofWeek(): Int {
        val src = Scanner(System.`in`)
        println("Enter Day:")
        val d = src.nextInt()
        println("Enter Month:")
        val m = src.nextInt()
        println("Enter Year:")
        val y = src.nextInt()
        val y0 = y - (14 - m) / 12
        println("Y0=$y0")
        val x = y0 + y0 / 4 - y0 / 100 + y0 / 400
        println("X=$x")
        val m0 = m + 12 * ((14 - m) / 12) - 2
        println("M0=$m0")
        val dw = (d + x + 31 * m0 / 12) % 7
        println("Day of week=$dw")

        when (dw) {
            1 -> println("Monday")
            2 -> println("Tuesday")
            3 -> println("Wednesday")
            4 -> println("Thursday")
            5 -> println("Friday")
            6 -> println("Saturday")
            7 -> println("Sunday")
        }
        src.close()
        return dw
    }

    @JvmStatic
    fun main(args: Array<String>) {
        dayofWeek()
    }
}