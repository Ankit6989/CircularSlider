package com.plcoding.circularslider

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.circularslider.ui.theme.CircularSliderTheme
import com.plcoding.circularslider.ui.theme.darkGray
import com.plcoding.circularslider.ui.theme.gray
import com.plcoding.circularslider.ui.theme.nightDark
import com.plcoding.circularslider.ui.theme.orange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CircularSliderTheme {
                CircularSlider(

                    modifier = Modifier
                        .background(nightDark),

                    initialValue = 0,
                    primaryColor = orange,
                    secondaryColor = gray,
                    circleRadius = 230f,
                    onPositionChange = {



                    }
                )
            }
        }
    }
}


