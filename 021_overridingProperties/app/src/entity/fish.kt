package app.src.entity
import app.src.entity.*

class Fish: Bird() {
    // Mengubah / Menimpa / Mengganti nilai attribute dari class parent
    override val name: String

    init {
        name = "Lele"
    }

    override fun info() {
        println("saya adalah seekor ikan " + (this.name))
    }
}