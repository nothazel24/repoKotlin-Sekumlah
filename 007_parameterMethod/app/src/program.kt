package app.src
import app.src.entity.katabaku

fun main() {
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // Variabel 
    val nilai1 = 5
    val nilai2 = 7

    // Membuat Object dari katabaku
    var calc = katabaku()

    // Penjumlahan, Perkalian, Pengurangan, dan Pembagian
    println("$nilai1 + $nilai2 = " + calc.jumlah(nilai1, nilai2))
    println("$nilai1 * $nilai2 = " + calc.kali(nilai1, nilai2))
    println("$nilai1 / $nilai2 = " + calc.bagi(nilai1, nilai2))
    println("$nilai1 - $nilai2 = " + calc.kurang(nilai1, nilai2))
}