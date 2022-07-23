package com.slaviboy.features.weather.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.slaviboy.composeunits.dw
import com.slaviboy.features.weather.home.composables.*

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
            Spacer(modifier = Modifier.height(0.06.dw))
            TopBar()

            Spacer(modifier = Modifier.height(0.3.dw))
            MainBox()

            Spacer(modifier = Modifier.height(0.04.dw))
            AirQualityIndex()

            Spacer(modifier = Modifier.height(0.28.dw))
            BoxTitle("5-day forecast")
            Spacer(modifier = Modifier.height(0.07.dw))
            Forecast5Days(
                listOf(
                    Forecast5DaysItem(),
                    Forecast5DaysItem(),
                    Forecast5DaysItem()
                )
            )
            Spacer(modifier = Modifier.height(0.1.dw))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(0.13.dw)
                    .padding(horizontal = 0.05.dw)
                    .background(
                        color = Color(0x28FFFFFF),
                        shape = RoundedCornerShape(0.1.dw)
                    )
            ) {
                Text(
                    text = "5-day forecast",
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(0.25.dw))
            BoxTitle("24-hours forecast")
            Spacer(modifier = Modifier.height(0.07.dw))
            Forecast24Hours(
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

            Spacer(modifier = Modifier.height(0.2.dw))
            BoxTitle("More info")
            Spacer(modifier = Modifier.height(0.07.dw))
            InfoBox()
            Spacer(modifier = Modifier.height(0.07.dw))
        }
    }
}

class Forecast5DaysItem(
    val time: Long = System.currentTimeMillis(),
    val temperature: Float = 20.2f,
    val weatherIconType: Int = 0,
    val windSpeed: Float = 13.4f
)

class Forecast24HoursItem(
    val time: Long = System.currentTimeMillis(),
    val temperature: Float = 20.2f,
    val weatherIconType: Int = 0,
    val windSpeed: Float = 13.4f
)


class Forecast24HoursItem3(
    val minTemperature: Float = 20.2f,
    val maxTemperature: Float = 20.2f,
)

// git commit -S -m "Test signed commmit GPG-key"
// git config --global gpg.program "C:\Program Files (x86)\GnuPG\bin\gpg.exe"
//