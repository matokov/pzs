@file:OptIn(ExperimentalMaterial3Api::class)

package sk.bwtplus.pzs.messagelog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(device = "id:pixel_5")
@Composable
fun MessageLogScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        OutlinedTextField(
//            value = messageText,
//            onValueChange = onMessageChange,
//            placeholder = {
//                Text("Enter a message")
//            },
//            modifier = Modifier
//                .padding(horizontal = 16.dp)
//                .fillMaxWidth()
//        )
        Spacer(Modifier.height(16.dp))
//        Row(
//            modifier = Modifier
//                .padding(horizontal = 16.dp)
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.End
//        ) {
//            IconButton(
//                onClick = onMessageSend
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Send,
//                    contentDescription = "Send"
//                )
//            }
//            Spacer(Modifier.width(16.dp))
//            IconButton(
//                onClick = onMessageBroadcast
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Share,
//                    contentDescription = "Broadcast"
//                )
//            }
//        }
    }

    @Composable
    fun MessageRowView(title:String, description: String) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = title, style = MaterialTheme.typography.bodyLarge)
                Text(text = description, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}