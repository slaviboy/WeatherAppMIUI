package com.slaviboy.features.weather.home.composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import com.slaviboy.composeunits.dw

@Composable
fun SunriseAndSunsetBox() {
    val angle = 130f

    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(0.25.dw)
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
                cap = StrokeCap.Round,
                pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 9f), 0f)
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
                cap = StrokeCap.Round,
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