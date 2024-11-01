package app.src.entity

public class Orang{
    var lemari = Lemari()

    // Method public
    public fun melihatLemari() {
        println("Melihat Isi package lemari a : ")
        lemari.isiLemari()
        println("Lemari ini bermerk "+lemari.merk)
    }
}