package app.src.entity
import app.src.entity.*

// Subclass / class child
class Cat: Goat(){
    // Class ini akan mewarisi semua metod / atribut dari class yang sebelumnya
    // yaitu di class "goat"

    override fun eat() {
        println("Kucing, sedang makan ikan & daging")
    }

    // UJI COBA
    // Method ini akan error, karena pada superclassnya method ini bersifat final, jadi tidak dapat diubah.
    // override fun breathing() {
    //     println("tidak bisa bernafas dia air")
    // }
}