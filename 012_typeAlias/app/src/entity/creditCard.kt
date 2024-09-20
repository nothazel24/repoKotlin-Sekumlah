package app.src.entity

typealias Card = String
typealias Pin = Int

// Mengatur alias type yang sudah ada 
class creditCard {
    // Method
    fun cardName(card:Card) {
        println("Nama kartu : " + card)
    }

    fun password(card:Pin) {
        println("Pin kartu : " + card)
    }
}