package app.src 
import app.src.entity.student

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // Checking "student" class
    // Atau pembuatan objek yang baru 
    var student_object = student()

    // Memanggil METHOD 
    student_object.introduction()
    student_object.quotes("Awali hari dengan bismillah dan akhiri dengan Alhamdulillah.")

    // Memanggil ATRIBUTE 
    println("Nama : " + student_object.name)
    println("Alamat : " + student_object.alamat)
    println("Mapel : " + student_object.mapel)

    // Mengubah ATTRIBUTE 
    student_object.name = "Yamada Ryou"
    student_object.alamat = "Shimokitazawa"
    student_object.mapel = "Produktif TKJT"
    student_object.introduction()

    // Memanggil ATTRIBUTE baru
    println("\nNama : " + student_object.name)
    println("Alamat : " + student_object.alamat)
    println("Mapel : " + student_object.mapel)
}