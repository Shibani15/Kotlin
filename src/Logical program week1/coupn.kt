object coupon
{

    @JvmStatic
    fun main(args: Array<String>) {
        // TODO Auto-generated method stub
        val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray()
        val max = 100000000
        var random = (Math.random() * max).toInt()
        val sb = StringBuffer()
        while (random > 0) {
            sb.append(chars[random % chars.size])
            random /= chars.size
        }
        val c = sb.toString()
        println("coupon number= $c")
    }

}
