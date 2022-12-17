package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposequadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposequadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposeQuadrantText(
                title = "Text composable",
                description = "Displays text and follows Material Design guidelines.",
                backgraoundcolor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
            ComposeQuadrantText(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgraoundcolor = Color.Green,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposeQuadrantText(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgraoundcolor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            ComposeQuadrantText(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgraoundcolor = Color.Gray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposeQuadrantText(
    title: String,
    description: String,
    backgraoundcolor: Color,
    modifier: Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgraoundcolor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposequadrantTheme {
        ComposeQuadrantApp()
    }
}