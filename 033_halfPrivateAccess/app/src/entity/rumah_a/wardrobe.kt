package app.src.entity

public class Lemari{
    private var merk: String = "Ambalabu"
    private var perusahaan: String = "PT. Mebel Nusantara"
    private var jenis: String = "Lemari kayu"

    // Method public
    fun isiLemari() {
        println("Isi Lemari : Pakaian!\nMerk : $merk")
        println("Di Produksi oleh perusahaan : $perusahaan")
        println("Jenis Lemari : $jenis")
    }
}

// USING PUBLIC CODE 
// public class Lemari {
//     public var merk:String = "Ambalabu"

//     // Method 
//     public fun isiLemari() {
//         println("pakaian!")
//     }
// }