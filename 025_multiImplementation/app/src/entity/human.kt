package app.src.entity

class Human: Cat(), Cow {

    override fun eatInfo() {
        super<Cat>.eatInfo()
        super<Cow>.eatInfo()
    }
}