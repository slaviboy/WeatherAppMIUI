package com.slaviboy.weatherappmiui

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.slaviboy.composeunits.initSize
import com.slaviboy.features.weather.home.HomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        transparentStatusBar()
        initSize()
        setContent {
            HomePage()
        }
    }

    fun Activity.transparentStatusBar() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        } else {
            window.setDecorFitsSystemWindows(false)
        }
    }
}
