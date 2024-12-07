package app.src.entity
import app.src.entity.*

/* ATRIBUT ABSTRACT PADA INTERFACE DITANDAI, TANPA ADANYA INISIALISASI NILAI
 METHOD PADA INTERFACE DITANDAI, TANPA ADANYA BLOCK BODY
*/

interface Animal{
    //atribute 
    // Abstract property tanpa memiliki nilai 
    var name:String 

    //mthod 
    // Abstract method (tanpa memiliki block body)
    fun eat()

    // non abstract
    fun animalInformation() = "animal name $name"

    /* method animalInformation diatas sama saja seperti dibawah ini  
    
    fun animalInformation():String {
        val info = ("animal name" + this.name)
        return info
    }
    
    */
}