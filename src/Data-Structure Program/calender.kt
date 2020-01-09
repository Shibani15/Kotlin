package com.bridgelabz.datastructures

import java.util.Scanner

object Calendar
{

    fun isLeapYear(year: Int): Boolean
    {

        return !(year % 400 != 0 || year % 4 != 0 && year % 100 == 0)
    }

    fun day(month: Int, day: Int, year: Int): Int
    {
        val y = year - (14 - month) / 12
        val x = y + y / 4 - y / 100 + y / 400
        val m = month + 12 * ((14 - month) / 12) - 2
        return (day + x + 31 * m / 12) % 7
    }


    @JvmStatic
    fun main(args: Array<String>)
    {

        val src = Scanner(System.`in`)
        println("Enter Month:")
        val month = src.nextInt()
        println("Enter Year:")
        val year = src.nextInt()

        val months = arrayOf(
            "",
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        )

        val days = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

        if (month == 2 && isLeapYear(year)) days[month] = 29

        println("   " + months[month] + " " + year)
        println(" S  M Tu  W Th  F  S")


        val d = day(month, 1, year)


        for (i in 0 until d)
            print("   ")
        for (i in 1..days[month])
        {
            System.out.printf("%2d ", i)
            if ((i + d) % 7 == 0 || i == days[month]) println()
        }

        src.close()
    }
}