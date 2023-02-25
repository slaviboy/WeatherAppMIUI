package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.slaviboy.composeunits.dw
import com.slaviboy.features.R

@Composable
fun InfoBoxContent() {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 0.09.dw)
    ) {
        InfoBoxItem(Modifier.weight(1f), R.drawable.ic_info_feels_like, R.string.feels_like, "30°C")
        Spacer(modifier = Modifier.width(0.1.dw))
        InfoBoxItem(Modifier.weight(1f), R.drawable.ic_info_humidity, R.string.humidity, "38%")
    }
    Spacer(modifier = Modifier.height(0.04.dw))
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 0.09.dw)
    ) {
        InfoBoxItem(Modifier.weight(1f), R.drawable.ic_info_rain, R.string.chance_of_rain, "70%")
        Spacer(modifier = Modifier.width(0.1.dw))
        InfoBoxItem(Modifier.weight(1f), R.drawable.ic_info_pressure, R.string.pressure, "302mbar")
    }
    Spacer(modifier = Modifier.height(0.04.dw))
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 0.09.dw)
    ) {
        InfoBoxItem(Modifier.weight(1f), R.drawable.ic_info_wind_speed, R.string.wind_speed, "22.8km/h")
        Spacer(modifier = Modifier.width(0.1.dw))
        InfoBoxItem(Modifier.weight(1f), R.drawable.ic_info_uv_index, R.string.uv_index, "5")
    }
}