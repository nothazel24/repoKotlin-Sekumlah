package app.src.entity

// Membuat constructor dan menetapkan nilai default pada usia
class Student {
    var name: String
    var age: Int

    // Blok Inisialisasi 
    // Blok ini akan di panggil secara otomatis
    init {
        println("Hello!")
    }

    // Secondary Constructor 
    // Secondary constructor tidak mengizinkan keyword val / var 
    constructor (_name: String, _age: Int) {
        this.name = _name
        this.age = _age
        println("Nama = $name")
        println("Umur = $age")
    }
}