package app.src.entity
import app.src.entity.*

class OtherPeople() {
    fun stealData() {
        var dad1 = Dad()

         // memanggil method
        println("Nama : " + dad1.dad_name) // akan error karena atribut bersifat protected
        println("Makanan : " + dad1.favFood()) // akan error karena atribut bersifat protected
    } 
}