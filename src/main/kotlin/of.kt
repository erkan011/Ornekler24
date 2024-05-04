enum class DayOfWeek{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    companion object{
        fun of(value:String): DayOfWeek? {
            return try {
                valueOf(value.uppercase())
            }catch (ex: IllegalArgumentException){
                null
            }
        }
    }
}
data class Person(val name: String , val age: Int){
    companion object{
        fun of(name: String , age: Int): Person{
            return Person(name, age)
        }
    }
}

fun main() {
    val person = Person.of("John",30)
    println(person)

    val day = DayOfWeek.of("friday")
    println(day)
}