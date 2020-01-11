package com.bridgelabz.datastructures

import java.util.Scanner

object PrimeArray
{

    fun isPrime(num: Int): Boolean
    {
        for (i in 2 until num)
        {
            if (num % i == 0)
            {
                return false
            }
        }
        return true
    }

    fun generate(n: Int): IntArray
    {

        val arr = IntArray(n)
        var index = 0
        for (i in 0 until n)
        {
            if (isPrime(i))
            {

                arr[index++] = i


            }

        }
        return arr
    }


    fun print(a1: IntArray, n: Int): IntArray
    {

        for (i in 0 until n)
        {
            print(a1[i].toString() + " ")
        }
        println()
        return a1
    }

    @JvmStatic
    fun main(args: Array<String>)
    {

        val array = generate(200)
        print(array, 50)

    }

}
