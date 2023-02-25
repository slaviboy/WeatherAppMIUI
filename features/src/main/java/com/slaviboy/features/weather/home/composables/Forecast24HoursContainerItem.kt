package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.features.R
import com.slaviboy.features.weather.home.entities.Forecast24HoursItem
import com.slaviboy.fonts.AnoFont

@Composable
fun Forecast24HoursContainerItem(forecast24HoursItem: Forecast24HoursItem = Forecast24HoursItem()) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "16:00",
            fontSize = 0.025.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
        Spacer(modifier = Modifier.height(0.02.dw))
        Text(
            "33°",
            fontSize = 0.045.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
        Spacer(modifier = Modifier.height(0.02.dw))
        Image(
            painter = painterResource(id = R.drawable.ic_day_clear_sky),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .wrapContentWidth()
                .height(0.07.dw)
        )
        Spacer(modifier = Modifier.height(0.02.dw))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .wrapContentSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_direction),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .wrapContentWidth()
                    .height(0.031.dw)
            )
            Spacer(modifier = Modifier.width(0.01.dw))
            Text(
                "3.5km/h",
                fontSize = 0.023.sw,
                fontFamily = AnoFont,
                color = Color(0xFFFEFFFF)
            )
        }
    }
}