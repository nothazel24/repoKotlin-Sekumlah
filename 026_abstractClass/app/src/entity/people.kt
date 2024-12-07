package app.src.entity

abstract class People {
    // atribut abstrak
    abstract var name: String
    abstract var age: Int
    abstract var work: String

    // method abstrak 
    abstract fun setPeopleAge(_age: Int)
    abstract fun getPeopleAge(): Int

    abstract fun setPeopleName(_name: String)
    abstract fun getPeopleName(): String

    abstract fun setPeopleWork(_work: String)
    abstract fun getPeopleWork(): String
    
}