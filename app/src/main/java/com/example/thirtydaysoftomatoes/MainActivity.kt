package com.example.thirtydaysoftomatoes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirtydaysoftomatoes.data.TomatoTip
import com.example.thirtydaysoftomatoes.ui.theme.ThirtyDaysOfTomatoesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysOfTomatoesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


@Composable
fun TomatoTipList(modifier: Modifier = Modifier) {

}


@Composable
fun TomatoTipCard(
    tomatoTip: TomatoTip,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Text(
            text = stringResource(id = tomatoTip.title)
        )
        Image(painter = painterResource(id = tomatoTip.image), contentDescription = null)
        Text(
            text = stringResource(id = tomatoTip.description)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TomatoTipCardPreview() {

}