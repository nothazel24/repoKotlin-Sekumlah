package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    var udin = Son() 
    udin.familyIntro()

    var anonymous = OtherPeople() //error
    anonymous.stealData() // error
}