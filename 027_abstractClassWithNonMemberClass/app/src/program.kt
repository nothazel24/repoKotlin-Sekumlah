package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // membuat objek 
    val ahmad = Worker("Ahmad")
    val age: Int

    // mengatur nilai pada atribut
    ahmad.setPeopleAge(22)

    // memanggil dan mendapatkan nilai pada atribut
    age = ahmad.getPeopleAge()
    ahmad.getPeopleName()

    // output
    println("Usia : $age")
}