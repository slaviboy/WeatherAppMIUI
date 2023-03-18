package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.fonts.AnoFont

@Composable
fun MainBox() {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
    ) {
        Text(
            "19",
            fontSize = 0.38.sw,
            fontFamily = AnoFont,
            color = Color(0xFFDBE8F8),
            modifier = Modifier
                .offset(x = (-0.03).dw, y = (-0.05).dw)
        )
        Text(
            "°C",
            fontSize = 0.061.sw,
            fontWeight = FontWeight.Bold,
            fontFamily = AnoFont,
            color = Color(0xFFDBE8F8),
            modifier = Modifier
                .offset(x = 0.1.dw, y = 0.05.dw)
        )
    }

    Spacer(modifier = Modifier.height(0.02.dw))
    Text(
        "Clear",
        fontSize = 0.05.sw,
        fontFamily = AnoFont,
        color = Color.White
    )
}