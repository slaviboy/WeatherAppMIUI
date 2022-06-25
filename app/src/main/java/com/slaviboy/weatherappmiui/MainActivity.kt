package com.slaviboy.weatherappmiui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.slaviboy.composeunits.initSize
import com.slaviboy.features.weather.home.HomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initSize()
        setContent {
            HomePage()
        }
    }
}
