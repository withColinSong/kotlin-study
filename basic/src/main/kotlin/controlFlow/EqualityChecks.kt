package controlFlow

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    // Returns true because it calls authors.equals(writers) and sets ignore element order.
    println(authors == writers)

    // Returns false because authors and writers are distinct references.
    println(authors === writers)
}