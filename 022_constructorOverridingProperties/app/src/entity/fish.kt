package app.src.entity
import app.src.entity.*

// Override property dapat dilakukan pada constructor
class Fish(override val name:String = "Lele"): Bird() {
    override fun info() {
        println("Saya adalah seekor ikan $name")
    }
}