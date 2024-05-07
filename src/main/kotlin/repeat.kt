fun main() {
    repeat(3){
        println("Erkan çalışkan")
    }
    repeat(5){index ->
        println("current index: $index")
    }

    val numbers = listOf(1,2,3,4,5)
    var sum = 0
    repeat(numbers.size){index ->
        sum += numbers[index]
    }
    println("Sum: $sum")
}