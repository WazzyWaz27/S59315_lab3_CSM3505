package com.example.businessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businessapp.ui.theme.BusinessappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessApp()
                }
            }
        }
    }
}

@Composable
fun BusinessApp() {
    val image = painterResource(R.drawable.android_logo)
    val phoneIcon = painterResource(id = R.drawable.ic_baseline_phone_24)
    val shareIcon = painterResource(id = R.drawable.ic_baseline_share_24)
    val emailIcon = painterResource(id = R.drawable.ic_baseline_email_24)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = "Android Logo",
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(
            text = "Ahmad Fawwaz",
            color = Color.White,
            fontSize = 60.sp
        )
        Text(
            text = "Android Developer",
            color = Color(0xFF7AF339),
            fontSize = 20.sp
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 500.dp)
            .padding(bottom = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .padding(start = 60.dp)
                .fillMaxWidth()
        ) {
            Icon(
                painter = phoneIcon,
                contentDescription = "Phone Logo",
                modifier = Modifier
                    .padding(start = 30.dp),
                Color(0xFF7AF339)
            )
            Text(
                text = "010-962 6765",
                modifier = Modifier
                    .padding(start = 30.dp),
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 60.dp)
                .fillMaxWidth()
        ) {
            Icon(
                painter = shareIcon,
                contentDescription = "Share Icon",
                modifier = Modifier
                    .padding(start = 30.dp, top = 10.dp),
                Color(0xFF7AF339)
            )
            Text(
                text = "@fawwazaziz",
                modifier = Modifier
                    .padding(start = 30.dp, top = 10.dp),
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 60.dp)
                .fillMaxWidth()
        ) {
            Icon(
                painter = emailIcon,
                contentDescription = "Email Icon",
                modifier = Modifier
                    .padding(start = 30.dp, top = 10.dp),
                Color(0xFF7AF339)
            )
            Text(
                text = "s59315@ocean.umt.edu.my",
                modifier = Modifier
                    .padding(start = 30.dp, top = 10.dp),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessappTheme {
        BusinessApp()
    }
}