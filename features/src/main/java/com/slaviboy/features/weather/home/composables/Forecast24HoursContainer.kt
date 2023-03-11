package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.slaviboy.composeunits.dw
import com.slaviboy.features.R
import com.slaviboy.features.weather.home.entities.Forecast24HoursItem

@Composable
fun Forecast24HoursContainer(forecast24HoursItems: List<Forecast24HoursItem>) {
    Box(
        modifier = Modifier
            .padding(horizontal = 0.06.dw)
            .background(
                color = Color(0x1AFFFFFF),
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
                iconResId = R.drawable.ic_clock,
                titleResId = R.string.twenty_four_hours_forecast
            )
            Spacer(modifier = Modifier.height(0.05.dw))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .wrapContentSize()
            ) {
                forecast24HoursItems.forEach { item ->
                    Spacer(modifier = Modifier.width(0.05.dw))
                    Forecast24HoursContainerItem(item)
                    Spacer(modifier = Modifier.width(0.05.dw))
                }
            }
        }
    }
}