package app.src.entity

class People {
    var name: String; var age: Int; var job: String; var jumlah_data: Int

    init {
        this.name = ""; this.age =0; this.job=""; this.jumlah_data=0
    }

    // First Secondary Constructor 
    constructor (_name: String, _age: Int, _job:String) {
        this.name = _name
        this.age = _age 
        this.job = _job
        println("Nama = $name |")
        println("Umur = $age |")
        println("Pekerjaan = $job |\n")
    }

    // Second Secondary Constructor 
    constructor (_name: String, _age: Int, _job: String, _jumlah_data: Int) {
        this.name = _name
        this.age = _age 
        this.job = _job
        this.jumlah_data = _jumlah_data
        println("Nama = $name |")
        println("Umur = $age |")
        println("Pekerjaan = $job |")
        println("Jumlah data = $jumlah_data |\n")
    }
}