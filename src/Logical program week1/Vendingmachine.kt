package com.bridgelabz.junittest

object Atm {

    fun atm(amount: Int): Int {
        var amount = amount

        val note = intArrayOf(2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
        val notecount = IntArray(11)
        for (i in note.indices) {
            if (amount >= note[i]) {
                notecount[i] = amount / note[i]
                amount = amount - notecount[i] * note[i]
            }
        }
        val n = note.size
        for (i in 0 until n) {
            println(i.toString() + "is" + note[i] + "::" + notecount[i])

        }
        println("maximum value is:" + note[note.size - 1])
        return amount
    }

    @JvmStatic
    fun main(args: Array<String>) {
        atm(1253)

    }
}