package app.src.entity

class Students {
    fun getAcquainted (name: String, gender: String) {
        println("Hallo, nama saya $name, saya seorang $gender")
    }

    fun getAcquainted (name: String, gender: String, address: String) {
        println("Hallo, nama saya $name, saya seorang $gender. Saya berasal dari $address")
    }

    fun getAcquainted (name: String, hobby: String, contact: Long) {
        println("Hallo, nama saya $name, hobby saya adalah $hobby. Hobby saya $hobby, dan nomor hp saya adalah $contact")
    }
}