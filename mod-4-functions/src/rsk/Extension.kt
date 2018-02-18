package rsk

fun main(args: Array<String>) {
    val text = "With   multiple \t whitespace"
    println(text)
    println(replaceMultipleWhitespace(text))
    println(text.replaceMultipleWhitespaceEx())
}

fun replaceMultipleWhitespace(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceMultipleWhitespaceEx() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}