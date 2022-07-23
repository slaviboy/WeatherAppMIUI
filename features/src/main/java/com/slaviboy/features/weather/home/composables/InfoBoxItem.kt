package com.slaviboy.features.weather.home.composables

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw

@Composable
fun InfoBoxItem(
    modifier: Modifier = Modifier,
    @DrawableRes imageResId: Int,
    @StringRes title: Int,
    description: String
) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .height(0.08.dw)
        )
        Spacer(modifier = Modifier.width(0.015.dw))
        Divider(
            color = Color(0x66FFFFFF),
            modifier = Modifier
                .height(0.06.dw)
                .width(1.dp)
        )
        Spacer(modifier = Modifier.width(0.015.dw))
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = stringResource(id = title),
                color = Color(0x66FFFFFF),
                fontSize = 0.028.sw
            )
            Text(
                text = description,
                color = Color.White,
                fontSize = 0.042.sw
            )
        }
    }
}