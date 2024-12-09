package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

   val apple = fruitType.APEL
   val banana = fruitType.PISANG
   val orange = fruitType.JERUK

   // DISPLAYING 
   println("${apple.fruitName}: ${apple.desc()}") 
   println("${banana.fruitName}: ${banana.desc()}") 
   println("${orange.fruitName}: ${orange.desc()}")
}