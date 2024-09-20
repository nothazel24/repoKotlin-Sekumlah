package app.src.entity

// Class Constructor pertama 
class Student (val name:String, val mapel:String, val alamat:String) {
    // Method 
    fun studentInfo() {
        println("~ Info Siswa ~")
        println("Nama : " + name)
        println("Mapel : " + mapel)
        println("E-Mail : " + alamat)
    }
}