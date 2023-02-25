package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.slaviboy.composeunits.dw
import com.slaviboy.features.R
import com.slaviboy.features.weather.home.Forecast5DaysItem

@Composable
fun Forecast5Days(forecast5DaysItems: List<Forecast5DaysItem>) {
    Box(
        modifier = Modifier
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
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            BoxTitleWithIcon(
                iconResId = R.drawable.ic_calendar,
                titleResId = R.string.five_day_forecast
            )
            Spacer(modifier = Modifier.height(0.05.dw))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                forecast5DaysItems.forEachIndexed { i, item ->
                    Spacer(modifier = Modifier.width(0.08.dw))
                    Forecast5DaysItem(item)
                    Spacer(modifier = Modifier.width(0.08.dw))
                    if (i < forecast5DaysItems.lastIndex) {
                        Divider(
                            color = Color.White,
                            modifier = Modifier
                                .height(0.176.dw)
                                .width(1.dp)
                        )
                    }
                }
            }
            RoundButton(
                titleResId = R.string.five_day_forecast
            )
        }
    }
}