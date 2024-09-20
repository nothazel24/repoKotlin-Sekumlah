package app.src.entity

class student {
    //ATTRIBUTE 
     var name:String = "Ryan Ferdiansyah"
     var mapel:String = "Produktif RPL"
     var alamat:String = "Kp. Gugunungan"

    //METHOD
    fun introduction() {
        println("hallo!, nama saya " + name)
        println("saya dari, " + alamat)
        println("dan pelajaran yang saya sukai adalah " + mapel)
    }

    fun quotes(quotes:String) {
        println("Sedikit quotes dari saya \n" + quotes)
    }
}