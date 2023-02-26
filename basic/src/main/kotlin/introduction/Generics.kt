package introduction

/**
 *
1. Defines a generic class MutableStack<E> where E is called the generic type parameter. At use-site, it is assigned to a specific type such as Int by declaring a MutableStack<Int>.
2. Inside the generic class, E can be used as a parameter like any other type.
3. You can also use E as a return type.
 */
class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main() {
    val mutableStackIntType = MutableStack<Int>()
    mutableStackIntType.push(1)
    mutableStackIntType.push(2)
    mutableStackIntType.push(3)

    println(mutableStackIntType.size())
    println(mutableStackIntType.pop())
    println(mutableStackIntType.size())
    println(mutableStackIntType.toString())

    val mutableStackStringType = MutableStack<String>()
    mutableStackStringType.push("hello1")
    mutableStackStringType.push("hello2")
    mutableStackStringType.push("hello3")

    println(mutableStackStringType.peek())
    println(mutableStackStringType.isEmpty())
    println(mutableStackStringType.toString())

}