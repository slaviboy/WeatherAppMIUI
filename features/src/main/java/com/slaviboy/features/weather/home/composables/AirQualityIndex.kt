package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.features.R
import com.slaviboy.fonts.RobotoFont

@Composable
fun AirQualityIndex(alpha: Float) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentWidth()
            .height(0.07.dw)
            .alpha(alpha + 0.95f)
            .background(
                color = Color(0x1AFFFFFF),
                shape = RoundedCornerShape(0.05.dw)
            )
    ) {
        Spacer(modifier = Modifier.width(0.04.dw))
        Image(
            painter = painterResource(id = R.drawable.ic_leaf),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .wrapContentWidth()
                .fillMaxHeight()
                .padding(vertical = 0.015.dw)
        )
        Spacer(modifier = Modifier.width(0.01.dw))
        Text(
            "AQI 32",
            fontSize = 0.03.sw,
            fontFamily = RobotoFont,
            color = Color.White
        )
        Spacer(modifier = Modifier.width(0.04.dw))
    }
}