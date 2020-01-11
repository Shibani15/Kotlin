package com.bridgelabz.datastructures

class Queue
{
    internal var Queue = IntArray(6)
    internal var front: Int = 0
    internal var rear: Int = 0
    internal var size: Int = 0

    val isEmpty: Boolean
        get() = size <= 0

    fun enqueue(data: Int): Int
    {
        Queue[rear] = data
        rear = rear + 1
        size = size + 1
        return data
    }

    fun dequeue()
    {
        val data: Int
        data = Queue[front]
        front = front + 1
        size = size - 1

    }

    fun show()
    {
        for (i in 0 until size)
        {
            print(Queue[i].toString() + " ")
        }
        println()
    }

    fun size(): Int
    {
        return size
    }

    companion object
    {

        @JvmStatic
        fun main(args: Array<String>)
        {
            val q = Queue()
            println("size is: " + q.isEmpty)
            q.enqueue(15)
            q.enqueue(25)
            q.enqueue(10)
            q.enqueue(5)
            q.show()
            println("size is: " + q.size())
            q.dequeue()
            q.show()
            println("size is: " + q.size())
            println("size is: " + q.isEmpty)


        }
    }

}