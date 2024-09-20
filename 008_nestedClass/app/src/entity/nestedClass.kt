package app.src.entity

class first {
    // FIRST CLASS
    var messages = "Hello!"
    fun greetings() = "$messages, Ini adalah function dari class 'first'"

    // SECOND CLASS (NESTED CLASS)
    class nested {
        fun greetings() = "dan ini adalah function di dalam 'Nested Class'"
    }
}