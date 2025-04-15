package sk.bwtplus.pzs.message

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import sk.bwtplus.pzs.ui.theme.PzsTheme

@Preview
@Composable
fun ChatScreenPreview() {
    PzsTheme {
        ChatScreen("Ahoj", {},{},{})
    }
}