package com.bridgelabz.datastructures

import java.util.Queue
import java.util.Scanner

class BankCashCounter {
    private var q = Queue()
    internal var src = Scanner(System.`in`)
    private var count: Int = 0
    fun bankcashcounter(amount: Int): Queue<*> {
        var amount = amount
        count = 0
        while (amount > 0) {
            println("Choose D Following Options to Perform Bank Operations:")
            println("1:Deposite Purpose Only")
            println("2:Withdraw Purpose Only")
            println("3:Check Current Bank Account Balance")

            val choice = src.nextInt()

            when (choice) {

                1 -> {
                    println("Enter D amount 2 be Deposit.")
                    val deposit = src.nextInt()
                    amount = amount + deposit
                    q.enqueue(count++)
                }
                2 -> {
                    println("Enter amount 2 be Withdraw.")
                    val Withdraw = src.nextInt()
                    if (Withdraw <= amount) {
                        amount = amount - Withdraw
                    } else {
                        println("Insufficient Funds")
                    }
                    q.enqueue(count++)
                }

                3 -> {
                    run { println("Current Account Balance is=$amount") }
                    run { println("Please Choose D valid Options 1 or 2 or 3") }
                }
                else -> {
                    println("Please Choose D valid Options 1 or 2 or 3")
                }
            }

        }

        src.close()
        return q
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val obj = BankCashCounter()
            val src = Scanner(System.`in`)
            println("Enter D amount::")
            val amount = src.nextInt()
            //		obj.bankcashcounter(amount);
            val q1 = obj.bankcashcounter(amount)
            q1.show()
            src.close()


        }
    }

}