package com.example.callsvk

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.callsvk.ui.theme.CallsVKTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.callsvk.ui.theme.BackgroundColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            CallsVKTheme(dynamicColor = false, darkTheme = false) {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackgroundColor
                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceBetween) {
                        TopButtonSet()
                        VideoPreview("You", R.drawable.legolas,R.string.profile_picture, Modifier.fillMaxWidth())
                        VideoPreview("Venera Phone Long Contact For Test And test Again And Again", R.drawable.tv,R.string.profile_picture,
                            Modifier
                                .weight(1f)
                                .fillMaxWidth() )
                        BottomButtonSet(modifier = Modifier)

                    }

                }
            }
        }
    }
}






@Preview(showBackground = true)
@Composable
fun MainPreview(){
    CallsVKTheme(dynamicColor = false, darkTheme = true) {

        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = BackgroundColor
        ) {
            Column(modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween) {
                TopButtonSet()
                VideoPreview("You", R.drawable.legolas,R.string.profile_picture, Modifier.fillMaxWidth())
                VideoPreview("Venera Phone Long Contact For Test And test Again And Again", R.drawable.tv,R.string.profile_picture,
                    Modifier
                        .weight(1f)
                        .fillMaxWidth() )
                BottomButtonSet(modifier = Modifier)

            }

        }
    }
}


//Произошли проблемы с реализацией BottomSheetScaffold, поэтому что есть, то есть.