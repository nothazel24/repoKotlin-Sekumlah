package app.src.entity
import app.src.entity.*

class Worker(_name: String) : People(_name) {
    override var age: Int = 0

    override fun setPeopleAge(_age: Int) {
        age = _age
    }

    override fun getPeopleAge(): Int {
        return age
    }
}