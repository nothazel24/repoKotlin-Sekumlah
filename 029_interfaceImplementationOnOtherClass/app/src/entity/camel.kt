package app.src.entity
import app.src.entity.*

class Camel: LivingCreatures{
    override var creatures_name: String = "Onta Arab"
    override var habitats: String = "Darat (Padang pasir)"

    override fun food_type(): String = "Herbivora"
    override fun info(){
        println("Nama manusia adalah : $creatures_name")
        println("Habitat / Tempat tinggal : $habitats")
        println("Jenis Makanan : ${food_type()}")
        println("---------------------------------------")
    }
}