package app.src.entity

class Cat(val _name:String, val _usia:Int, val _ras:String) {
    // Anggota Variabel 
    var name:String; var usia:Int; var ras:String;

    // Blok Inisialisasi 
    // Blok Ini akan dipanggil otomatis ketika objek dari class dibuat
    init {
        this.name = _name
        this.usia = _usia
        this.ras = _ras

        println("Nama : $name")
        println("Usia : $usia")
        println("Ras : $ras\n")
    } 

    // Method 
    fun sound(sound:String) = println(sound)
}