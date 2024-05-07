fun add(a:Int, b: Int): Int{//1
    return a+b
}

fun checkNumber(number: Int): String{
    return if (number > 0){
        "positive"
    }else if (number < 0){
        "negative"
    }else{
        "zero"
    }
}
fun main() {
    val result = add(5,7)//1
    println("Sonuç: $result")

    //--------------------------------

    println(checkNumber(5))
    println(checkNumber(-5))
    println(checkNumber(0))
}