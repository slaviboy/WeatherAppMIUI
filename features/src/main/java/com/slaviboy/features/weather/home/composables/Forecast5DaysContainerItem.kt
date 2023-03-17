package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.features.R
import com.slaviboy.features.weather.home.entities.Forecast5DaysItem
import com.slaviboy.fonts.AnoFont

@Composable
fun Forecast5DaysContainerItem(forecast5DaysItem: Forecast5DaysItem = Forecast5DaysItem()) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "(Clear)",
            fontSize = 0.028.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_day_clear_sky),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .wrapContentWidth()
                .height(0.11.dw)
        )
        Spacer(modifier = Modifier.height(0.025.dw))
        Text(
            "22°/33°",
            fontSize = 0.038.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
        Spacer(modifier = Modifier.height(0.01.dw))
        Text(
            "Sat",
            fontSize = 0.027.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
    }
}