package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    var people = Students()

    people.getAcquainted("Ryan Bajindul", "Pria")
    people.getAcquainted("Ryan Bajindul", "Pria", "Bandung")
    people.getAcquainted("Ryan Bajindul", "Panahan", 87654321)
}