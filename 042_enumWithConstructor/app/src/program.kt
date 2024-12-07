package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    val rupiah = Currency.IDR
    val euro = Currency.EUR

    println("Nilai tukar 1 ${rupiah.currencyName} terhadap ${Currency.USD.currencyName}: ${rupiah.usdExchangeRate}")
    println("Nilai tukar 1 ${euro.currencyName} terhadap ${Currency.USD.currencyName}: ${euro.usdExchangeRate}")
}