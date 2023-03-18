package com.slaviboy.features.weather.home

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.slaviboy.composeunits.DeviceHeight
import com.slaviboy.composeunits.DeviceWidth
import com.slaviboy.composeunits.dh
import com.slaviboy.composeunits.dw
import com.slaviboy.features.weather.home.composables.*
import com.slaviboy.features.weather.home.entities.Forecast24HoursItem
import com.slaviboy.features.weather.home.entities.Forecast5DaysItem
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest

@Composable
fun HomePage() {
    Background()
    val scrollState = rememberScrollState()
    val alpha = 1f - (scrollState.value / (DeviceHeight * 0.17f)) // [0,1]
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .verticalScroll(scrollState)
        ) {

            Spacer(modifier = Modifier.height(0.45.dw))
            MainBox(alpha)

            Spacer(modifier = Modifier.height(0.04.dw))
            AirQualityIndex(alpha)

            Spacer(modifier = Modifier.height(0.28.dw))
            Forecast5DaysContainer(
                listOf(
                    Forecast5DaysItem(),
                    Forecast5DaysItem(),
                    Forecast5DaysItem()
                )
            )

            Spacer(modifier = Modifier.height(0.07.dw))
            Forecast24HoursContainer(
                listOf(
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem(),
                    Forecast24HoursItem()
                )
            )

            Spacer(modifier = Modifier.height(0.07.dw))
            InfoBox()
            Spacer(modifier = Modifier.height(0.1.dw))
        }
        ToolbarHome()
    }
}

// git commit -S -m "Test signed commmit GPG-key"
// git config --global gpg.program "C:\Program Files (x86)\GnuPG\bin\gpg.exe"
//