package app.src.entity

// parent class
open class Bird {
    open val name: String = "Merpati"

    open fun info() {
        println("Hey!, Saya adalah seekor burung " + this.name)
    }
}