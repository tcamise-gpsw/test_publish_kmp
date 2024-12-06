package com.gopro.capitalize.business

fun uncapitalize(text: String): String =
    text.split(" ")
        .map { word ->
            word.replaceFirstChar { char ->
                char.lowercaseChar()
            }
        }.reduce { a, b -> a + " " + b }

fun capitalize(text: String): String =
    text.split(" ")
        .map { word ->
            word.replaceFirstChar { char ->
                char.uppercaseChar()
            }
        }.reduce { a, b -> a + " " + b }