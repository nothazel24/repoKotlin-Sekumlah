package app.src.entity

abstract class People(_name: String) {
    var name: String            // Non abstract
    abstract var age: Int       // Abstract

    // Block inisialisasi
    init {
        this.name = _name
    }

    // Abstract 
    abstract fun setPeopleAge(_age: Int)
    abstract fun getPeopleAge(): Int

    // Non Abstract
    fun getPeopleName() {
        println("Nama : $name")
    }
    
}