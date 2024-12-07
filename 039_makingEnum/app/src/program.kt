package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    val thisDay = dayInOneWeek.SABTU

    // Menampilkan pesan berdasarkan hari ini
    val messages = when (thisDay) {
        dayInOneWeek.SABTU, dayInOneWeek.MINGGU -> "Hari libur!"
        dayInOneWeek.SENIN -> "Tetap semangat!!"
        dayInOneWeek.SELASA, dayInOneWeek.RABU, dayInOneWeek.KAMIS -> "Hari sekumlah biasa"
        dayInOneWeek.JUMAT -> "Hari Jum'at. sudah hampir libur, horreeeee....."
    }

    println("Hari ini adalah hari $thisDay. $messages")
}