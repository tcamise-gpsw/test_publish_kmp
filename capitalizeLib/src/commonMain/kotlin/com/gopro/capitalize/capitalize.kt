fun myUncapitalize(text: String): String =
    text.split(" ")
        .map { word ->
            word.replaceFirstChar { char ->
                char.lowercaseChar()
            }
        }.reduce { a, b -> a + " " + b }

fun myCapitalize(text: String): String =
    text.split(" ")
        .map { word ->
            word.replaceFirstChar { char ->
                char.uppercaseChar()
            }
        }.reduce { a, b -> a + " " + b }