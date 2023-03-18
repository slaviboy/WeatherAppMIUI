package com.slaviboy.features.weather.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
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

            Spacer(modifier = Modifier.height(0.45.dw))
            MainBox()

            Spacer(modifier = Modifier.height(0.04.dw))
            AirQualityIndex()

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