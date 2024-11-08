package app.src.entity
import app.src.entity.*

class Son(override val name: String = "Nisa"): Dad() {
    override fun intro() {
        println("saya dalah sworang anak")

        // Mengakses member atribut & method dari superclass
        super.favFood()
    }

    override fun favFood() {
        println(this.name + "suka makan ketoprak")
    }
}