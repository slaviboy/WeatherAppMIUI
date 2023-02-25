package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.features.R

@Composable
fun InfoBox() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 0.06.dw)
            .background(
                color = Color(0x28FFFFFF),
                shape = RoundedCornerShape(0.04.dw)
            )
            .padding(
                top = 0.045.dw,
                bottom = 0.08.dw
            )
    ) {
        BoxTitleWithIcon(
            iconResId = R.drawable.ic_info,
            titleResId = R.string.more_info
        )
        Spacer(modifier = Modifier.height(0.05.dw))
        SunriseAndSunsetBox()
        Spacer(modifier = Modifier.height(0.1.dw))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 0.055.dw)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "05:52",
                    color = Color.White,
                    fontSize = 0.032.sw
                )
                Text(
                    text = "Sunrise",
                    color = Color.White,
                    fontSize = 0.025.sw
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "05:52",
                    color = Color.White,
                    fontSize = 0.032.sw
                )
                Text(
                    text = "Sunrise",
                    color = Color.White,
                    fontSize = 0.025.sw
                )
            }
        }
        Spacer(modifier = Modifier.height(0.1.dw))
        InfoBoxContent()
    }
}
