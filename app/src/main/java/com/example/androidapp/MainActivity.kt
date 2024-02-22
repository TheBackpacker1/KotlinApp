package com.example.androidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Lexi", "Take a look at Jetpack Compose, it's great!"))

        }
        }
    }




data class Message(val author:String,val body:String)


@Composable
fun MessageCard(msg: Message ) {
    Row {
        var modifier = Modifier.padding(all = 8.dp)

        Image(
            painter = painterResource(R.drawable.med),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

Spacer(modifier = Modifier.width(8.dp))
        Column {
            
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }
}


    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard(
            msg = Message("Lexi", "Take a look at Jetpack Compose, it's great!")
        )
    }





