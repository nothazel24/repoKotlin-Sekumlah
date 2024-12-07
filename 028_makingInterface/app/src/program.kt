package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // Membuat Objek 
    val Fish1 = Fish()
    Fish1.eat() // calling method
    println(Fish1.animalInformation()) // calling method 
    Fish1.name = "Ikan Buyur" // Changing attribute value 
    println("Ikan baru : ${Fish1.animalInformation()}") // calling method

    println("\n")

    // Membuat Objek 
    val Giraffe1 = Giraffe()
    Giraffe1.eat() // calling method
    println(Giraffe1.animalInformation()) // calling method 
    Giraffe1.name = "AmbaGiraffe" // Changing attribute value 
    println("Jerapah baru : ${Giraffe1.animalInformation()}") // calling method
}