package com.bridgelabz.datastructures

class LinkedList {
    internal var head: Node? = null

    inner class Node {
        internal var data: Int = 0
        internal var next: Node? = null
    }

    fun insert(data: Int) {
        val node = Node()
        node.data = data
        node.next = null
        if (head == null) {
            head = node
        } else {
            var n = head
            while (n!!.next != null) {
                n = n.next
            }
            n.next = node
        }

    }

    fun insertAtstart(data: Int) {
        val n = Node()
        n.data = data
        n.next = null
        n.next = head
        head = n
    }

    fun insertAtpos(pos: Int, data: Int) {
        if (pos == 0) {
            insertAtstart(data)
        } else {

            val n = Node()
            n.data = data
            n.next = null

            var m = head
            for (i in 0 until pos - 1) {
                m = m!!.next}
            n.next = m!!.next
            m.next = n
        }
    }

    fun delete(pos: Int) {
        if (pos == 0) {
            head = head!!.next

        } else {
            var n = head
            var n1: Node? = null
            for (i in 0 until pos - 1) {
                n = n!!.next
            }
            n1 = n!!.next
            n.next = n1!!.next
            println("n1::" + pos + "is:" + n1.data)
        }

    }

    fun show() {
        var node = head
        while (node!!.next != null) {
            println(node.data)
            node = node.next

        }
        println(node.data)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val list = LinkedList()
            list.insert(15)
            list.insert(25)
            list.insert(35)
            list.insert(45)
            list.insertAtstart(85)
            list.insertAtpos(2, 30)
            list.insertAtpos(1, 91)
            list.delete(0)
            list.delete(1)
            list.delete(2)
            list.delete(3)
            list.insertAtpos(2, 37)

            list.show()
        }
    }

}