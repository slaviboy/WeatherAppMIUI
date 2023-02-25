package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.slaviboy.composeunits.dw
import com.slaviboy.features.weather.home.Forecast24HoursItem

@Composable
fun Forecast24Hours(forecast24HoursItems: List<Forecast24HoursItem>) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .wrapContentSize()
            .padding(horizontal = 0.06.dw)
    ) {
        forecast24HoursItems.forEach { item ->
            Spacer(modifier = Modifier.width(0.05.dw))
            Forecast24HoursItem(item)
            Spacer(modifier = Modifier.width(0.05.dw))
        }
    }
}