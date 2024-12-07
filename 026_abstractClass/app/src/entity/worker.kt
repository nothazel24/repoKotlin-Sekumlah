package app.src.entity
import app.src.entity.*

class Worker : People() {
    // Implementasi dari kelas abstrak
    override var name: String = ""
    override var age: Int = 0
    override var work: String = ""

    // Implementasi method atribut dari kelas abstract
    override fun setPeopleAge(_age:Int){
        age = _age
    }

    override fun setPeopleName(_name:String){
        name = _name
    }

    override fun setPeopleWork(_work:String){
        work = _work
    }

    override fun getPeopleAge(): Int = age
    override fun getPeopleName(): String = name
    override fun getPeopleWork(): String = work
}