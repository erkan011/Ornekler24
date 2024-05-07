import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val dateTime = LocalDateTime.now()
    val formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val formattedDateTime1 = dateTime.format(formatter1)
    println("Formatted DataTime 1: $formattedDateTime1")

    val formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a")
    val formattedDateTime2 = dateTime.format(formatter2)
    println("Formatted DateTime 2: $formattedDateTime2")
}