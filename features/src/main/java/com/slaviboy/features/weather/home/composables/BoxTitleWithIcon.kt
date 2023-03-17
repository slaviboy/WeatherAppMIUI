package com.slaviboy.features.weather.home.composables

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.fonts.RobotoFont

@Composable
fun BoxTitleWithIcon(
    @DrawableRes iconResId: Int,
    @StringRes titleResId: Int
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentSize()
    ) {
        Spacer(modifier = Modifier.width(0.05.dw))
        Image(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .wrapContentWidth()
                .height(0.04.dw)
        )
        Spacer(modifier = Modifier.width(0.02.dw))
        Text(
            stringResource(id = titleResId),
            fontSize = 0.034.sw,
            fontFamily = RobotoFont,
            color = Color(0xA6FFFFFF)
        )
    }
}