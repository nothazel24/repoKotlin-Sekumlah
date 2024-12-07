package app.src.entity

public class Orang{
    var lemari = Lemari() // ini akan error, karena class ini bersifat privat

    public fun melihatLemari() {
        println("Melihat Isi package berbeda (rumah a): ")
        lemari.isiLemari() // ini akan error, karena class ini bersifat privat
        println("Lemari ini bermerk "+lemari.merk) // mengakses merk akan error juga karena bersifat privat
    }
}

/* class orang tidak dapat megakses class lemari beserta atribut dan methodnya
dikarenakan class lemari beserta atribut method nya memiliki visibilitas
/ hak akses bersifat privat. Sehingga tidak dapat diakses secara sembarangan */