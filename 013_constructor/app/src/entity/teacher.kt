package app.src.entity

// Class Constructor pertama 
class Teacher constructor (val name:String, val mapel:String, val email:String) {
    // Method 
    fun teacherInfo() {
        println("~ Info Guru ~")
        println("Nama : " + name)
        println("Mapel : " + mapel)
        println("E-Mail : " + email)
    }
}