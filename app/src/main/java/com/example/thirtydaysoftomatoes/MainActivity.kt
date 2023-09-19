package com.example.thirtydaysoftomatoes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirtydaysoftomatoes.data.TomatoTip
import com.example.thirtydaysoftomatoes.data.TomatoTipsRepository
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
    dayNumber: Int,
    modifier: Modifier = Modifier
) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(
                top = dimensionResource(id = R.dimen.padding_medium),
                end = dimensionResource(id = R.dimen.padding_medium),
                start = dimensionResource(id = R.dimen.padding_medium)
            )
        ) {

            Text(
                text = stringResource(id = R.string.day) + " $dayNumber",
                modifier = Modifier.weight(1f)
            )


            Image(
                painter = painterResource(id = tomatoTip.image),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = dimensionResource(id = R.dimen.padding_medium))
                    .size(dimensionResource(id = R.dimen.image_size))
                    .clip(MaterialTheme.shapes.extraLarge)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = dimensionResource(id = R.dimen.padding_medium))
        ) {
            Text(
                text = stringResource(id = tomatoTip.title),
                textAlign = TextAlign.End,
                modifier = modifier.weight(1f)
            )
            ExpandButton(
                expanded = expanded,
                onClick = { expanded = !expanded },
                modifier

                    .padding(end = dimensionResource(id = R.dimen.padding_medium))
            )
        }

        if (expanded) {
            Text(
                text = stringResource(id = tomatoTip.description),
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(
                    start = dimensionResource(id = R.dimen.padding_medium),
                    end = dimensionResource(id = R.dimen.padding_medium),
                    bottom = dimensionResource(id = R.dimen.padding_medium)
                )
            )
        }


    }
}

@Composable
fun ExpandButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = if (expanded) ImageVector.vectorResource(id = R.drawable.nutrition_24px) else ImageVector.vectorResource(
                id = R.drawable.psychiatry_24px
            ),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.secondary
        )

    }
}

@Preview(showBackground = true)
@Composable
fun TomatoTipCardPreview() {
    TomatoTipCard(tomatoTip = TomatoTipsRepository.tomatoTips[0], dayNumber = 1)
}