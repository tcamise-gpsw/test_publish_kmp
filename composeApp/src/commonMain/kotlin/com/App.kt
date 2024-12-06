package com

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import myCapitalize
import myUncapitalize
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var shouldCapitalize by remember { mutableStateOf(true) }
        var testText by remember { mutableStateOf("test text") }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(testText)
            Button(onClick = {
                testText = if (shouldCapitalize) myCapitalize(testText) else myUncapitalize(testText)
                shouldCapitalize = !shouldCapitalize
            }) {
                Text("Click me to toggle capitalize!")
            }
        }
    }
}