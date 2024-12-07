package app.src.entity

enum class Currency (val currencyName: String, val usdExchangeRate: Double) {
    USD ("Dolar Amerika", 1.0),
    EUR ("Euro", 0.83),
    GBP ("Poundsterling Inggris", 0.72),
    JPY ("Yen Jepang", 109.50),
    IDR ("Rupiah Indonesia", 14400.0)
    
}