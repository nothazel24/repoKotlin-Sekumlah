package app.src.entity

// Membuat constructor dan menetapkan nilai default pada usia
class Human(val _name:String, val _age:Int=20) {
    // Mmberikan variabel pada satu class
    var name:String
    var age:Int

    init {
        this.name = _name
        this.age = _age 
        println("Nama = $name")
        println("Usia = $age\n")
    }
}