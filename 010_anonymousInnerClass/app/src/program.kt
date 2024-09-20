package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    var ryan:Student = object:Student {
        // ANONYMOUS CLASS
        override fun quotes() {
            // OVERRIDING THE "QUOTES" METHOD
            println("Ryan: Manfaatkan waktu belajar, tetap semangat!")
        }
    }

    var rafi:Student = object:Student {
        // ANONYMOUS CLASS
        override fun quotes() {
            // OVERRIDING THE "QUOTES" METHOD
            println("Rafi: Jangan lupa berdo'a disetiap aktivitasmu!")
        }
    }

    // Memanggil class
    ryan.quotes()
    rafi.quotes()
}