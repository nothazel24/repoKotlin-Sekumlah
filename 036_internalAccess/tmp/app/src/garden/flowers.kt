package app.src.garden

class Flowers() {
    var name = "Bougenville"
    var origin = "Amerika Selatan"
    var benefit = "Hiasan Rambut"
    var media = Media ()

    // method 
    public fun flowersInfo() {
        var flower_info = """ Bougainvillea is known for its vibrant and colorful bracts, which are often mistaken for flowers. The actual flowers are small and usually white, surrounded by these large, paper-like bracts in colors like magenta, purple, red, orange, white, and yellow. The plant is popular in tropical and subtropical regions and can be grown as a vine, bush, or even a small tree. """;
        println(flower_info)
    }

    public fun detailInfo() {
        println("Nama Bunga: ")
        println("Asal Bunga: ")
        println("Jenis Bunga: ")
        println("Nama Bunga: ")

        println("Media tanam: " + media.growing_media)
        println("Jenis tanah: " + media.growing_media)
        println("Jenis tempat: " + media.media_venues)

        println("Lokasi Penyimpanan: " + media.storage_location)
    }
}