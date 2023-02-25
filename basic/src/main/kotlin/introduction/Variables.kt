/**
 * Kotlin doc.
 * https://play.kotlinlang.org/byExample/01_introduction/03_Variables
 */
fun main() {
    /**
     * 1.
     * Kotlin has powerful type inference.
     * While you can explicitly declare the type of a variable, you'll usually let the compiler do the work by inferring it.
     * Kotlin does not enforce immutability, though it is recommended. In essence use val over var.
     *
     * var 재정의 가능
     * val == const
     */

    var a : String = "initial"
    println(a)
    a = "declare";
    println(a)

    val b :  Int = 1
    var c = 3 // 타입 추론 가능

    /**
     * 2.
     * Declares a variable without initialization.
     * An attempt to use the variable causes a compiler error: Variable 'e' must be initialized.
     */
    var e : Int
    //println(e)  // error

    /**
     * 3.
     * You're free to choose when you initialize a variable, however, it must be initialized before the first read.
     *
     * Declares a variable without initialization.
     * Initializes the variable with different values depending on some condition.
     * Reading the variable is possible because it's already been initialized.
     */
    val d: Int

    if (true) {
        d = 1
    } else {
        d = 2
    }

    println(d) // 3
}