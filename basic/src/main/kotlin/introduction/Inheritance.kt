package introduction


// 1. final default 이므로 상속받으려면 open으로 설정해야한다.
open class Dog {
    // 2. method 또한 open으로 설정해야 override 가능하다
    open fun sayHello() {
        println("wooow")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("Yorkshire")
    }
}

// 2. Inheritance with Parameterized Constructor
open class Tiger(val origin : String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia") {
    public fun childHello() {
        println("you belong with me!");
    }
};

// 3. Passing Constructor Arguments to Superclass
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("A Lion from $origin says: grrhhh!")
    }
}

class Asiatic(name: String) : Lion(name, "India");

fun main() {
    val dog : Dog = Yorkshire()
    dog.sayHello()

    SiberianTiger().sayHello();
    SiberianTiger().childHello();
}