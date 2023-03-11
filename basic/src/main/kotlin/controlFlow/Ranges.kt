package controlFlow

fun main() {

    range()
    charRange()
    ifRange(5)
}

fun range() {
    // for(i=0; i<=3; ++i) { ... }
    for(i in 0..3) {
        print(i)
    }

    println()

    // for(i=0; i<3; ++i) { ... }
    for(i in 0 until 3) {
        print(i)
    }

    println();

    for(i in 2..8 step 2) {
        print(i)     // 2468
    }

    println();

    for (i in 3 downTo 0) {
        print(i)    // 3210
    }

}

fun charRange() {

    for (c in 'a'..'d') {
        print(c)    // abcd
    }

    println()

    for (c in 'z' downTo 's' step 2) {
        print(c)    // zxvt
    }

    println()
}


fun ifRange(x:Int) {
    if(x in 1..5) {
        println("x is in range from 1 to 5")
    }

    if(x !in 6..10) {
        println("x is not in range from 6 to 10")
    }
}
