package com.example.jogoandroidenemys

import android.R.attr.bottom
import android.R.attr.contentDescription
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jogoandroidenemys.ui.theme.JogoAndroidEnemysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JogoAndroidEnemysTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaMain(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TelaMain(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        Column(
            modifier = Modifier
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
                ) {
                Text(
                    text = "Score: 0050",
                    color = Color.White
                )
                Row(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = "Lives: ",
                        color = Color.White
                    )
                    AndroidEnemy(
                        modifier = Modifier
                            .size(16.dp),
                        color = Color.Green
                    )
                    AndroidEnemy(
                        modifier = Modifier
                            .size(16.dp),
                        color = Color.Green
                    )
                    AndroidEnemy(
                        modifier = Modifier
                            .size(16.dp),
                        color = Color.Green
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                AndroidEnemy(
                    modifier = Modifier,
                    color = Color.Green
                )
                AndroidEnemy(
                    modifier = Modifier,
                    color = Color.Blue
                )
                AndroidEnemy(
                    modifier = Modifier,
                    color = Color.Red
                )
                AndroidEnemy(
                    modifier = Modifier,
                    color = Color.Yellow
                )
                AndroidEnemy(
                    modifier = Modifier,
                    color = Color.Green
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom

        ) {
            AndroidEnemy(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(Color.Gray)
                    .padding(15.dp)
                    .fillMaxWidth(),
                text = "Press Start",
                color = Color.White,
                fontSize = 32.sp
            )
        }
    }
}

@Composable
fun TelaGameOver(modifier: Modifier = Modifier) {
    Box() { }
}

@Composable
fun AndroidEnemy(modifier: Modifier = Modifier, color: Color) {
    Image(
        modifier = modifier
            .size(66.dp),
        painter = painterResource(R.drawable.ic_android_black_24dp),
        contentDescription = "AndroidEnemy",
        colorFilter = ColorFilter.tint(color),

    )
}