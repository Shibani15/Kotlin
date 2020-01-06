internal class Stack {
    var top: Int = 0
    var a = IntArray(MAX) // Maximum size of Stack

    val isEmpty: Boolean
        get() = top < 0

    init {
        top = -1
    }

    fun push(x: Int): Boolean {
        if (top >= MAX - 1) {
            println("Stack Overflow")
            return false
        } else {
            a[++top] = x
            println("$x pushed into stack")
            return true
        }
    }

    fun pop(): Int {
        if (top < 0) {
            println("Stack Underflow")
            return 0
        } else {
            return a[top--]
        }
    }

    fun peek(): Int {
        if (top < 0) {
            println("Stack Underflow")
            return 0
        } else {
            return a[top]
        }
    }

    companion object {
        val MAX = 1000
    }
}

// Driver code
internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Stack()
        s.push(10)
        s.push(20)
        s.push(30)
        println(s.pop().toString() + " Popped from stack")
    }
} 