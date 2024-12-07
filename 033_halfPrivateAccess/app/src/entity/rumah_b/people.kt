package app.src.entity

public class Orang{
    var lemari = Lemari() 

    public fun melihatLemari() {
        println("Melihat Isi package berbeda (rumah a): ")
        lemari.isiLemari()
    }
}

/* class orang tidak dapat megakses class lemari beserta atribut dan methodnya
dikarenakan class lemari beserta atribut method nya memiliki visibilitas
/ hak akses bersifat privat. Sehingga tidak dapat diakses secara sembarangan */