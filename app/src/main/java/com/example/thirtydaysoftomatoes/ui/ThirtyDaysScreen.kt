package com.example.thirtydaysoftomatoes.ui

import androidx.annotation.DrawableRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
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
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.thirtydaysoftomatoes.R
import com.example.thirtydaysoftomatoes.data.TomatoTip
import com.example.thirtydaysoftomatoes.ui.theme.ThirtyDaysOfTomatoesTheme
import com.example.thirtydaysoftomatoes.utils.ThirtyDaysContentType
import com.example.thirtydaysoftomatoes.utils.shouldBeFlipped

@Composable
fun ThirtyDaysApp(windowSize: WindowWidthSizeClass) {
    val contentType = when (windowSize) {
        WindowWidthSizeClass.Expanded -> ThirtyDaysContentType.Feed
        else -> ThirtyDaysContentType.ListOnly
    }
    Scaffold(topBar = { TomatoTipsTopAppBar() }) {
        if (contentType == ThirtyDaysContentType.Feed) {
            TomatoTipFeed(
                contentPadding = it
            )
        } else {
            TomatoTipList(
                contentPadding = it
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TomatoTipsTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.scaffold_text),
                style = MaterialTheme.typography.titleLarge
            )
        },
        modifier = modifier
    )
}

@Composable
fun TomatoTipList(
    modifier: Modifier = Modifier,
    viewModel: ThirtyDaysViewModel = viewModel(),
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    val uiState by viewModel.uiState.collectAsState()
    LazyColumn(contentPadding = contentPadding) {
        ->
        items(uiState.listOfTips) {
            TomatoTipCard(
                tomatoTip = it,
                isFlipped = it.dayNumber % 2 == 0,
                modifier = modifier.padding(
                    top = dimensionResource(id = R.dimen.padding_small),
                    start = dimensionResource(id = R.dimen.padding_medium),
                    end = dimensionResource(id = R.dimen.padding_medium)
                )
            )
        }
    }
}

@Composable
fun TomatoTipFeed(
    modifier: Modifier = Modifier,
    viewModel: ThirtyDaysViewModel = viewModel(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    val uiState by viewModel.uiState.collectAsState()
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_large)),
        modifier = Modifier.padding(
            start = dimensionResource(id = R.dimen.padding_large),
            end = dimensionResource(id = R.dimen.padding_large)
        )
    ) {
        ->
        items(uiState.listOfTips) {
            TomatoTipCard(
                tomatoTip = it,
                isFlipped = shouldBeFlipped(it.dayNumber, uiState.listOfTips.size),
                modifier = modifier.padding(
                    bottom = dimensionResource(id = R.dimen.padding_small),
                )
            )
        }
    }
}


@Composable
fun TomatoTipCard(
    tomatoTip: TomatoTip,
    modifier: Modifier = Modifier,
    isFlipped: Boolean = false
) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        ),
        modifier = modifier.animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioNoBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    ) {
        if (isFlipped) {
            FlippedTitleRow(dayNumber = tomatoTip.dayNumber, imageId = tomatoTip.image)
        } else {
            TitleRow(dayNumber = tomatoTip.dayNumber, imageId = tomatoTip.image)
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
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleMedium,
                modifier = modifier
                    .padding(
                        end = dimensionResource(id = R.dimen.padding_small),
                        bottom = dimensionResource(id = R.dimen.padding_small)
                    )
                    .weight(1f)
            )
            ExpandButton(
                expanded = expanded,
                onClick = {
                    expanded = !expanded
                },
                modifier

                    .padding(
                        end = dimensionResource(id = R.dimen.padding_medium),
                        bottom = dimensionResource(id = R.dimen.padding_small)
                    )
            )
        }

        if (expanded) {
            Text(
                text = stringResource(id = tomatoTip.description),
                textAlign = TextAlign.Justify,
                style = MaterialTheme.typography.bodyLarge,
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
fun TitleRow(dayNumber: Int, @DrawableRes imageId: Int) {
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
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(start = dimensionResource(id = R.dimen.padding_medium))
                .weight(1f)
        )

        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.image_size))
                .clip(MaterialTheme.shapes.extraLarge)
        )
    }
}

@Composable
fun FlippedTitleRow(dayNumber: Int, @DrawableRes imageId: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(
            top = dimensionResource(id = R.dimen.padding_medium),
            end = dimensionResource(id = R.dimen.padding_medium),
            start = dimensionResource(id = R.dimen.padding_medium)
        )
    ) {

        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.image_size))
                .clip(MaterialTheme.shapes.extraLarge)
        )
        Text(
            text = stringResource(id = R.string.day) + " $dayNumber",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(
                    end = dimensionResource(id = R.dimen.padding_medium),
                    start = dimensionResource(id = R.dimen.padding_medium)
                )
                .weight(1f)
        )

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
            contentDescription = stringResource(id = R.string.expand_button),
            tint = if (expanded) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.primary
        )

    }
}

@Preview(
    showBackground = true,
    device = Devices.PHONE
)
@Composable
fun TomatoTipPreview() {
    ThirtyDaysOfTomatoesTheme {
        ThirtyDaysApp(windowSize = WindowWidthSizeClass.Compact)
    }

}

@Preview(
    showBackground = true,
    device = Devices.TABLET
)
@Composable
fun TomatoTipExpandedPreview() {
    ThirtyDaysOfTomatoesTheme {
        ThirtyDaysApp(windowSize = WindowWidthSizeClass.Expanded)
    }

}