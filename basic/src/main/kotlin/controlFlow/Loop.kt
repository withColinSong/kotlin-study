package controlFlow

fun main() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    // for
    for (a in cakes) {
        println("Yummy! $a")
    }

    var cakesEaten = 0
    var cakesBaked = 0

    // while
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    // do while
    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < 5)

    // iterator
    val zoo = Zoo(listOf(Animal("Cow"), Animal("Cat"), Animal("Dog")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }


}

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

class Animal(val name: String)
class Zoo(val animals: List<Animal>) {
    operator fun iterator() : Iterator<Animal> {
        return animals.iterator()
    }
}