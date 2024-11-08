package app.src.entity

open class Dad {
    open val name: String

    init {
        name = "Budi"
    }

    // Method 
    open fun intro() {
        println("Saya adalah seorang Ayah")
    }

    open fun favFood() {
        println("Ayah $name suka makan burger")
    }
}