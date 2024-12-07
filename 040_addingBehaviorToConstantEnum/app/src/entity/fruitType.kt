package app.src.entity

enum class fruitType (val fruitName: String) {
    APEL("Apel") {
        override fun desc(): String {
            return "Buah ini memiliki rasa manis dan renyah"
        }
    }, 

    PISANG("Pisang") {
        override fun desc(): String {
            return "Buah ini kaya kalium dan lezat"
        }
    }, 

    JERUK("Jeruk") {
        override fun desc(): String {
            return "Buah ini mengandung banyak vitamin C."
        }
    };

    abstract fun desc(): String
}