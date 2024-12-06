import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Capitalize",
    ) {
        App()
    }
}