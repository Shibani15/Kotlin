import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter
import java.util.Scanner

typealias OrderedLIst = Any

class HashingFunction
{
    internal var list = arrayOfNulls<OrderedLIst>(11)

    init
    {
        for (i in list.indices)
        {
            list[i] = OrderedLIst()
        }
    }

    internal fun put(n: Int)
    {
        list[n % 11].run { add1(n) }
    }

    internal fun search(n: Int): Boolean?
    {
        return list[n % 11]?.equals(n)
    }

    companion object
    {

        @JvmStatic
        fun main(args: Array<String>)
        {
            val hf = HashingFunction()
            val ll = OrderedLIst()
            println("sout no of elements to add")
            val s = Scanner(System.`in`)

            val n = s.nextInt()
            for (i in 0 until n)
            {
                ll.run { add1(s.nextInt()) }
            }

            /*
		 * try { Scanner s = new Scanner(new
		 * File(/hashingnumbers.txt")); while
		 * (s.hasNextInt()) { int i = s.nextInt(); hf.put(i);
		 * System.out.println(hf.list[i % 11]); System.out.println(i); } } catch
		 * (FileNotFoundException e) { System.out.println("Exception");
		 * e.printStackTrace(); }
		 */
        }

        private fun add1(nextInt: Int)
        {

        }
    }
}