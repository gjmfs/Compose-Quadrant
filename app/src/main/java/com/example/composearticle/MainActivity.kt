package com.example.composearticle

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeQuadrant

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrant {
                Surface() {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Card(title:String,message:String,color:Long,modifier: Modifier=Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .background(Color(color))
            .padding(16.dp)
        ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = message,
            textAlign = TextAlign.Justify,
            modifier = modifier
        )
    }
}

@Composable
fun Main(modifier: Modifier=Modifier){
    Column {
        Row(modifier=modifier.weight(1f)) {
            Card(
                title = stringResource(R.string.title1),
                message = stringResource(R.string.message1),
                color = 0xFFEADDFF,
                modifier=modifier.weight(1f)

            )
            Card(
                title = stringResource(R.string.title1),
                message = stringResource(R.string.message1),
                color = 0xFFD0BCFF,
                modifier=modifier.weight(1f)
            )
        }
        Row(modifier=modifier.weight(1f)) {
            Card(
                title = stringResource(R.string.title1),
                message = stringResource(R.string.message1),
                color = 0xFFD0BCFF,
                modifier=modifier.weight(1f)

            )
            Card(
                title = stringResource(R.string.title1),
                message = stringResource(R.string.message1),
                color = 0xFFEADDFF,
                modifier=modifier.weight(1f)
            )
        }
    }
}



@Preview(showBackground = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun MainPreview() {
    ComposeQuadrant {
        Main()
    }
}