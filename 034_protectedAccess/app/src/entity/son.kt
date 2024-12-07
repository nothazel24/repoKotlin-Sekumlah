package app.src.entity
import app.src.entity.*

class Son: Dad() {
    var name = "Udin"

    fun familyIntro() {
        println("Halo, nama saya $name\n Saya tinggal bersama ayah saya.\n Ayah saya bernama : $dad_name.\n Dan, ${favFood()}.")
    }
}