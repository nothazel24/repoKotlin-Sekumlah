package app.src.entity

// Superclass 
open class Bird {
    open val name: String = "Merpati"

    open fun info() {
        println("Hey!, saya adalah seekor burung " + this.name)
    }
}