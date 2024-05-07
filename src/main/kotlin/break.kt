fun main() {
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }

    //-----------------------------------//

    var i = 1
    while (i <= 10) {
        println(i)
        if (i == 5) {
            break
        }
        i++
    }

    //--------------------------------------//

    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    for (number in numbers) {
        if (number % 2 == 0) {
            break
        }
        println(number)
    }
}