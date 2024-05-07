fun main() {
    val numbers = listOf(10,20,30,40,50,60,70,80,90)
    for ((index, value ) in numbers.withIndex()){
        println("Index: $index, value: $value")
    }
    val fruits = mutableListOf("Apple","banana","cherry")

    for ((index1, value1) in fruits.withIndex()){
        println("index1: $index1, value1: $value1")
    }
}