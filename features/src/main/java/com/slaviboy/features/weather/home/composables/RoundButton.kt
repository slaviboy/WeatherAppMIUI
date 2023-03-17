package com.slaviboy.features.weather.home.composables

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.slaviboy.composeunits.dw

@Composable
fun RoundButton(
    @StringRes titleResId: Int
) {
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
            text = stringResource(id = titleResId),
            color = Color.White
        )
    }
}