package com.bridgelabz.algorithm

import java.util.Arrays
import java.util.Scanner

object Anagram
{
    fun anagram(): Boolean
    {
        val src = Scanner(System.`in`)
        println("Enter String 1::")
        val s1 = src.nextLine()
        println("Enter String 2::")
        val s2 = src.nextLine()
        val a1 = s1.toCharArray()
        val a2 = s2.toCharArray()
        val n1 = a1.size
        val n2 = a2.size

        if (n1 != n2)
        {
            return false
        } else
        {
            Arrays.sort(a1)
            Arrays.sort(a2)

            for (i in 0 until n1)
            {
                if (a1[i] != a2[i])
                {
                    return false
                }
            }
        }
        src.close()
        return true
    }

    @JvmStatic
    fun main(args: Array<String>)
    {

        if (anagram())
        {
            println("Both are Anagram")
        } else
        {
            println("Both are not Anagram")
        }

    }

}