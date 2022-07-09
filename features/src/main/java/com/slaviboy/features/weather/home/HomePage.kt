package com.slaviboy.features.weather.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.slaviboy.composeunits.dw
import com.slaviboy.composeunits.sw
import com.slaviboy.features.R
import com.slaviboy.fonts.AnoFont
import com.slaviboy.fonts.RobotoFont

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
            Spacer(modifier = Modifier.height(0.25.dw))
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
            Spacer(modifier = Modifier.height(0.18.dw))
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
            Spacer(modifier = Modifier.height(0.15.dw))
            InfoBox()
        }
    }
}

@Composable
fun InfoBox() {
    SunriseAndSunsetBox()
}

@Composable
fun SunriseAndSunsetBox() {
    val angle = 130f

    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(0.2.dw)
            .padding(horizontal = 0.1.dw)
    ) {

        val w = size.width
        val h = size.height * 2.5f
        val topOffset = size.height * .1f

        // angle [0, 180]
        drawArc(
            color = Color.White,
            startAngle = -180f,
            sweepAngle = 180f,
            useCenter = false,
            size = Size(w, h),
            topLeft = Offset(0f, topOffset),
            style = Stroke(
                width = 2f,
                pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 4f), 0f)
            )
        )
        drawArc(
            color = Color.White,
            startAngle = -180f,
            sweepAngle = angle,
            useCenter = false,
            size = Size(w, h),
            topLeft = Offset(0f, topOffset),
            style = Stroke(
                width = 3f,
                pathEffect = PathEffect.dashPathEffect(floatArrayOf(14f, 0f), 6f)
            )
        )

        // angle [-180, -0]
        val rx = w / 2f
        val ry = h / 2f
        val t = Math.tan((angle - 180.0) / 360.0 * Math.PI).toFloat()
        val t2 = t * t
        val px = rx * (1 - t2) / (1f + t2)
        val py = ry * 2 * t / (1f + t2)
        val r = this.size.height * 0.1f
        drawCircle(
            color = Color(0xFFFFD285),
            radius = r,
            center = Offset(px + rx, py + ry + topOffset)
        )
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
                        Color(0xFF357FD4),
                        Color(0xFF6AA4E3)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                )
            )
    )
}

@Composable
fun TopBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(0.13.dw)
            .padding(horizontal = 0.05.dw)
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

@Composable
fun MainBox() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Text(
            "26",
            fontSize = 0.32.sw,
            fontFamily = AnoFont,
            color = Color(0xFFDBE8F8)
        )
        Text(
            "°C",
            fontSize = 0.061.sw,
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
        fontSize = 0.05.sw,
        fontFamily = AnoFont,
        color = Color.White
    )
}

@Composable
fun AirQualityIndex() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentWidth()
            .height(0.07.dw)
            .background(
                color = Color(0x33FFFFFF),
                shape = RoundedCornerShape(0.05.dw)
            )
    ) {
        Spacer(modifier = Modifier.width(0.02.dw))
        Image(
            painter = painterResource(id = R.drawable.ic_leaf),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .wrapContentWidth()
                .fillMaxHeight()
                .padding(vertical = 0.015.dw)
        )
        Spacer(modifier = Modifier.width(0.01.dw))
        Text(
            "AQI 32",
            fontSize = 0.03.sw,
            fontFamily = RobotoFont,
            color = Color.White
        )
        Spacer(modifier = Modifier.width(0.02.dw))
    }
}

@Composable
fun Forecast24Hours(forecast24HoursItems: List<Forecast24HoursItem>) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .wrapContentSize()
            .padding(horizontal = 0.1.dw)
    ) {
        forecast24HoursItems.forEach { item ->
            Spacer(modifier = Modifier.width(0.05.dw))
            Forecast24HoursItem(item)
            Spacer(modifier = Modifier.width(0.05.dw))
        }
    }
}

@Composable
fun Forecast24HoursItem(forecast24HoursItem: Forecast24HoursItem) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "16:00",
            fontSize = 0.025.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
        Spacer(modifier = Modifier.height(0.02.dw))
        Text(
            "33°",
            fontSize = 0.045.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
        Spacer(modifier = Modifier.height(0.02.dw))
        Image(
            painter = painterResource(id = R.drawable.ic_day_clear_sky),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .wrapContentWidth()
                .height(0.07.dw)
        )
        Spacer(modifier = Modifier.height(0.02.dw))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .wrapContentSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_direction),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .wrapContentWidth()
                    .height(0.031.dw)
            )
            Spacer(modifier = Modifier.width(0.01.dw))
            Text(
                "3.5km/h",
                fontSize = 0.023.sw,
                fontFamily = AnoFont,
                color = Color(0xFFFEFFFF)
            )
        }
    }
}


@Composable
fun Forecast5Days(forecast5DaysItems: List<Forecast5DaysItem>) {
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
}

@Composable
fun Forecast5DaysItem(forecast5DaysItem: Forecast5DaysItem) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "(Clear)",
            fontSize = 0.028.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_day_clear_sky),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .wrapContentWidth()
                .height(0.11.dw)
        )
        Spacer(modifier = Modifier.height(0.025.dw))
        Text(
            "22°/33°",
            fontSize = 0.038.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
        Spacer(modifier = Modifier.height(0.01.dw))
        Text(
            "Sat",
            fontSize = 0.027.sw,
            fontFamily = AnoFont,
            color = Color(0xFFFEFFFF)
        )
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