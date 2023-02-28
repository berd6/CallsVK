package com.example.callsvk

import android.os.Build.VERSION
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.callsvk.ui.theme.CallsVKTheme


@Preview(apiLevel = 33)
@Composable
fun Prew(){
    CallsVKTheme(false,false) {
        Column() {
            VideoPreview("You", R.drawable.legolas,R.string.profile_picture, Modifier.weight(1f) )


        }
    }


}


@Composable
fun VideoPreview(name:String, imagePath:Int, contentDescription:Int,modifier: Modifier){

    Surface(shape = RoundedCornerShape(8) ) {

        Row() {


        Box(/*modifier = Modifer.fillMaxWidth()*/) {

            if (VERSION.SDK_INT >= 31)
                Image(
                    painter = painterResource(id = imagePath),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .matchParentSize()


                        .blur(
                            150.dp,
                            edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(8.dp))
                        )
                )
            else
                Image(
                    painter = painterResource(id = imagePath),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.matchParentSize(),
                    colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
                )


            Image(
                painter = painterResource(id = imagePath),
                contentDescription = stringResource(id = contentDescription),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .padding(64.dp)
                    .clip(CircleShape)
                    .align(Alignment.Center)

            )
            Text(
                text = name,
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(8.dp)
            )


        }
        }

    }
}


// Blur настоящий, где поддерживаем официально, а где нет - чёрно-белая копия аватарки (В зависимости от API)