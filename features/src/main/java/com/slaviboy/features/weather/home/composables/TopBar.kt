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
import com.slaviboy.fonts.RobotoFont

@Composable
fun TopBar() {
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
            fontSize = 0.04.sw,
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