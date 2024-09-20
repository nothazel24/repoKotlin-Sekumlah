package app.src

fun main (){
    println("---------------------------------------------------")
    println("      Lat. Triple Class : Ryan Ferdiansyah         ")
    println("---------------------------------------------------")

    // Mendeklarasikan TRIPLE
    var triple = Triple("Ryan Ferdiansyah", "Laki - laki", "Bandung")

    println("Nama : " + triple.first)
    println("Jenis Kelamin : " + triple.second)
    println("Alamat : " + triple.third)

    println("------------------")

    // Mendeklarasikan TRIPLE 
    val (x, y, z) = Triple(1, "Yamada ryou", "Shimokitazawa")
    println("No : " + x)
    println("Nama : " + y)
    println("Alamat : " + z)
}