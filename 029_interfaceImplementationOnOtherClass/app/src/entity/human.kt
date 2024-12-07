package app.src.entity
import app.src.entity.*

class Human: LivingCreatures {
    // Implementasi atribut dari interface makhluk hidup
    override var creatures_name: String = "Nisa"
    override var habitats: String = "Darat"

    // Implementasi atribut dari interface makhluk hidup
    override fun food_type(): String = "Omnivora"
    override fun info() {
        println("Nama manusia adalah : $creatures_name")
        println("Habitat / Tempat tinggal : $habitats")
        println("Jenis Makanan : ${food_type()}")
        println("---------------------------------------")
    }
}