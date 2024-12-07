package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // membuat objek 
    val worker = Worker()

    // mengatur nilai pada atribut
    worker.setPeopleName("Ryan bajindul")
    worker.setPeopleAge(18)
    worker.setPeopleWork("Student")

    // memanggil dan mendapatkan nilai pada atribut
    println("Nama : " + worker.getPeopleName())
    println("Umur : " + worker.getPeopleAge())
    println("Pekerjaan : " + worker.getPeopleWork())
}