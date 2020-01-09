package com.bridgelabz.algorithm

import java.util.Scanner

object BinarySearchWord
{
    fun sorted(a: Array<String>): Array<String>
    {
        val n = a.size
        for (i in 0 until n)
        {
            for (j in i + 1 until n)
            {
                if (a[i] > a[j])
                {
                    val temp = a[i]
                    a[i] = a[j]
                    a[j] = temp
                }
            }
        }
        return a
    }

    @JvmStatic
    fun main(args: Array<String>)
    {
        val a = arrayOf("mango", "apple", "kiwi", "strawberry", "pineapple", "coconut")
        sorted(a)
        for (print in a)
        {
            print("$print  ")
        }
        println()
        val src = Scanner(System.`in`)
        println("Enter key :")
        val key = src.nextLine()

        for (k in a.indices)
        {

            if (key.compareTo(a[k]) == 0 || key.equals(a[k], ignoreCase = true))
            {

                println("$key\tIs On index no:$k")


            }
        }

    }

}