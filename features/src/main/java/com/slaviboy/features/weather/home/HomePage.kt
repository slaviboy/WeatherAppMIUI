package com.slaviboy.features.weather.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontWeight
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.features.R
import com.slaviboy.fonts.AnoFont
import com.slaviboy.fonts.RobotoFont

@OptIn(ExperimentalTextApi::class)
@Composable
fun HomePage() {
    Background()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(0.13.dw)
                    .background(Color.Green)
                    .padding(horizontal = 0.05.dw)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .wrapContentWidth()
                        .fillMaxHeight()
                        .padding(0.038.dw)
                )
                Text(
                    "Blagoevgrad",
                    fontSize = 0.045.sw,
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
                        .padding(0.038.dw)
                )
            }

            Spacer(modifier = Modifier.height(0.3.dw))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(Color.Green)
            ) {
                Text(
                    "26",
                    fontSize = 0.34.sw,
                    fontFamily = AnoFont,
                    color = Color(0xFFDBE8F8),
                    modifier = Modifier
                        .background(Color.Blue)
                )
                Text(
                    "°C",
                    fontSize = 0.065.sw,
                    fontWeight = FontWeight.Black,
                    fontFamily = AnoFont,
                    color = Color(0xFFDBE8F8),
                    modifier = Modifier
                        .offset(y = 0.05.dw)
                )
            }

            Spacer(modifier = Modifier.height(0.02.dw))
            Text(
                "Clear",
                fontSize = 0.06.sw,
                fontFamily = AnoFont,
                color = Color.White,
                modifier = Modifier
                    .background(Color.Blue)
            )

            Spacer(modifier = Modifier.height(0.04.dw))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .wrapContentWidth()
                    .height(0.08.dw)
                    .background(
                        color = Color(0x33FFFFFF),
                        shape = RoundedCornerShape(0.05.dw)
                    )
            ) {
                Spacer(modifier = Modifier.width(0.01.dw))
                Image(
                    painter = painterResource(id = R.drawable.ic_leaf),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .wrapContentWidth()
                        .fillMaxHeight()
                        .padding(0.01.dw)
                )
                Spacer(modifier = Modifier.width(0.015.dw))
                Text(
                    "AQI 32",
                    fontSize = 0.04.sw,
                    fontFamily = AnoFont,
                    color = Color.White,
                    modifier = Modifier
                        .background(Color.Blue)
                )
                Spacer(modifier = Modifier.width(0.02.dw))
            }
        }
    }
}

@Composable
fun Background() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF0071D1),
                        Color(0xFF6BA5E4)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                )
            )
    )
}