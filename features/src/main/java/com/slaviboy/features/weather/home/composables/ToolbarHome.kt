package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.slaviboy.composeunits.DeviceHeight
import com.slaviboy.composeunits.DeviceWidth
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.features.R
import com.slaviboy.fonts.RobotoFont

@Composable
fun ToolbarHome() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF357FD4),
                        Color(0xFF6AA4E3)
                    ),
                    start = Offset.Zero,
                    end = Offset(DeviceWidth, DeviceHeight)
                )
            )
    ) {
        Spacer(modifier = Modifier.height(0.09.dw))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(0.13.dw)
                .padding(horizontal = 0.03.dw)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_plus),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .wrapContentWidth()
                    .fillMaxHeight()
                    .padding(0.043.dw)
            )
            Text(
                "Blagoevgrad",
                fontSize = 0.05.sw,
                fontFamily = RobotoFont,
                color = Color.White
            )
            Image(
                painter = painterResource(id = R.drawable.ic_more),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .wrapContentWidth()
                    .fillMaxHeight()
                    .padding(0.043.dw)
            )
        }
    }
}