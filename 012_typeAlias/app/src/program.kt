package app.src
import app.src.entity.*

// Mengatur nama aliasa dari type class kartu kredit
typealias atmCard = creditCard

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // Membuat objek dari class card
    var creditCard = atmCard()

    // Memanggil Method 
    creditCard.cardName("Mandiri")
    creditCard.password(112832)

}