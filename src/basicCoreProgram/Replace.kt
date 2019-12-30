class Replace {

}

    val templet : String = "Hello <<UserName>>, How are you?"

     val name="Sani"
fun main()
{
    val result="${templet.replace("<<UserName>>",name)}"
            println(result)

}

