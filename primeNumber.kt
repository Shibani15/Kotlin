package com.bridgelabz.algorithm

import java.util.Scanner

object CheckPrimeNo
{
    fun primeno(): Int
    {
        val src = Scanner(System.`in`)
        val n = src.nextInt()
        val m = n / 2
        var flag = 0
        if (n == 0 || n == 1)
        {
            println("$n\t No is not prime.")
        } else
        {
            for (i in 2 until m)
            {
                if (n % i == 0)
                {
                    flag = 1
                    println("$n\tNo is not prime.")
                }
            }
        }

        if (flag == 0)
        {
            println("$n\tNo IS Prime")
        }


        src.close()
        return n
    }

    @JvmStatic
    fun main(args: Array<String>)
    {
        primeno()
    }
}