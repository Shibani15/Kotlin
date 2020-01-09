object BalancedParan {
    internal class stack {
        var top = -1
        var items = CharArray(100)

        val isEmpty: Boolean
            get() = if (top == -1) true else false

        fun push(x: Char) {
            if (top == 99) {
                println("Stack full")
            } else {
                items[++top] = x
            }
        }

        fun pop(): Char {
            if (top == -1) {
                println("Underflow error")
                return '\u0000'
            } else {
                val element = items[top]
                top--
                return element
            }
        }
    }

    /* Returns true if character1 and character2
       are matching left and right Parenthesis */
    internal fun isMatchingPair(character1: Char, character2: Char): Boolean {
        return if (character1 == '(' && character2 == ')')
            true
        else if (character1 == '{' && character2 == '}')
            true
        else if (character1 == '[' && character2 == ']')
            true
        else
            false
    }

    /* Return true if expression has balanced
       Parenthesis */
    internal fun areParenthesisBalanced(exp: CharArray): Boolean {
        /* Declare an empty character stack */
        val st = stack()

        /* Traverse the given expression to
          check matching parenthesis */
        for (i in exp.indices) {

            /*If the exp[i] is a starting
            parenthesis then push it*/
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                st.push(exp[i])

            /* If exp[i] is an ending parenthesis
             then pop from stack and check if the
             popped parenthesis is a matching pair*/
            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

                /* If we see an ending parenthesis without
                 a pair then return false*/
                if (st.isEmpty) {
                    return false
                } else if (!isMatchingPair(st.pop(), exp[i])) {
                    return false
                }/* Pop the top element from stack, if
                it is not a pair parenthesis of character
                then there is a mismatch. This happens for
                expressions like {(}) */
            }

        }

        /* If there is something left in expression
          then there is a starting parenthesis without
          a closing parenthesis */

        return if (st.isEmpty)
            true /*balanced*/
        else {   /*not balanced*/
            false
        }
    }

    /* UTILITY FUNCTIONS */
    /*driver program to test above functions*/
    @JvmStatic
    fun main(args: Array<String>) {
        val exp = charArrayOf('{', '(', ')', '}', '[', ']')
        if (areParenthesisBalanced(exp))
            println("Balanced ")
        else
            println("Not Balanced ")
    }

}