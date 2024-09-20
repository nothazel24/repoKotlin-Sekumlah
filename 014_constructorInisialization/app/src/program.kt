package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // Membuat Objek 
    val cat1 = Cat("Mpus", 2, "Anggora")
    val cat2 = Cat("Garfield", 1, "Persia")
    val cat3 = Cat("Belang", 3, "Liar")

    // Memanggil Attribute dan Method 
    print("${cat1.name} bersuara ")
    cat1.sound("MIAAAAAAAWWWW")

    print("${cat2.name} bersuara ")
    cat2.sound("MEEEEONNGGGGG")

    print("${cat3.name} bersuara ")
    cat3.sound("MAAAONNGGGGGG")
}