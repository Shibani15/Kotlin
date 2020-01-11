package com.codesjava

import java.util.ArrayList

class Test {
    private val deque = ArrayList<Int>()

    fun insertFront(item: Int) {
        println("Adding element at front: $item")
        deque.add(0, item)
        println(deque)
    }

    fun insertRear(item: Int) {
        println("Adding element at rear: $item")
        deque.add(item)
        println(deque)
    }

    fun removeFront() {
        if (deque.isEmpty()) {
            println("Underflow state.")
            return
        }
        val rem = deque.removeAt(0)
        println("Remove element from front: $rem")
        println(deque)
    }

    fun removeRear() {
        if (deque.isEmpty()) {
            println("Underflow state.")
            return
        }
        val rem = deque.removeAt(deque.size - 1)
        println("Removed element from front: $rem")
        println(deque)
    }

    fun peakFront(): Int {
        val item = deque[0]
        println("Element at first: $item")
        return item
    }

    fun peakRear(): Int {
        val item = deque[deque.size - 1]
        println("Element at rear: $item")
        return item
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            try {
                val deque = Test()
                deque.insertFront(134)
                deque.insertFront(14)
                deque.insertFront(13)
                deque.removeFront()
                deque.insertRear(455)
                deque.removeFront()
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }
}