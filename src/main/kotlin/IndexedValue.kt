fun main() {
    val numbers = listOf(0,1,2,3,4,5,6,7,8,9)
    var sum = 0
    for (indexValue in numbers.withIndex()){
        sum += indexValue.index * indexValue.value
    }
    println("Sum: $sum")


    val filteredValues = numbers.withIndex()
        .filter { indexedValue -> indexedValue.index % 2 == 0 }
        .map { indexedValue -> indexedValue.value * 2 }
    println("filtered Values: $filteredValues")
}