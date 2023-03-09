package controlFlow

fun main() {
    cases(1);
    cases("hello");
    cases(1L);
    cases(2);

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("hello")
        "hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
    }
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass