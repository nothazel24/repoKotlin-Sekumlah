package app.src.entity

interface LivingCreatures {
    // abstract property
    var creatures_name: String
    var habitats: String

    // method
    fun food_type(): String
    fun info()
}