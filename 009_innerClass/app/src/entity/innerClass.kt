package app.src.entity

class first {
    // FIRST CLASS
    var messages = "Hello!"
    fun greetings() = "$messages, Ini adalah function dari class 'first'"

    // SECOND CLASS (NESTED CLASS)
    inner class inClass {
        fun greetings() = "dan ini adalah function di dalam 'Inner Class'"
        // NOTE : INNER CLASS DAPAT MEMANGGIL ATTRIBUTE DARI CLASS UTAMA / CLASS LUAR
    }
}