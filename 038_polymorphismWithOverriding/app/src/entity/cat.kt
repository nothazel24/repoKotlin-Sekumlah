package app.src.entity

class Cat: Animal() {
    override fun eat() {
        super.eat()
        println("Kucing makan whiskas.")
    }
}