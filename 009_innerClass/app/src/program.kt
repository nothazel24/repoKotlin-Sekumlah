package app.src
import app.src.entity.first

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // Membuat Object dari class "first"
    val classOut = first()

    // Membuat Objek dari class bersarang (nested class)
    val innerClass = first().inClass()

    //Output
    println(classOut.greetings())
    println(innerClass.greetings())
}