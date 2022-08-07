fun main() {
    //String type
    val text = "Kotlin"
    val firstChar = text[0]
    println("First character of $text is $firstChar")

    //Indexing in String
    for (char in text) {
        print("$char ")
    }
    println("")

    //Escaped String
    val statement = "Kotlin is \"Awesome!\""
    println(statement)

    //Escaped String Unicode
    val name = "Unicode test: \u00A9"
    println(name)

    //Raw String
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    print(line)
}