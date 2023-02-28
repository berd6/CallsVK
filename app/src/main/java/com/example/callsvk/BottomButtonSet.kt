package com.example.callsvk

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.callsvk.ui.theme.RedIconColor
import com.example.callsvk.ui.theme.WhiteIconColor

@Composable
fun BottomButtonSet(modifier: Modifier = Modifier) {
    Column {
        Image(painter = painterResource(id =R.drawable.baseline_horizontal_rule_24 ) ,
            contentDescription = null,
            modifier = Modifier.align(Alignment.CenterHorizontally) )

        Row(
            horizontalArrangement = (Arrangement.SpaceAround), modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {


            var toggle by remember {
                mutableStateOf(false)
            }
            FilledTonalIconButton(
                colors = IconButtonDefaults.filledTonalIconButtonColors(
                    containerColor = Color.DarkGray,),
                onClick = {toggle==!toggle}
            )
                    //checkedContainerColor = WhiteIconColor
                {


                    Image(
                        painter = painterResource(id =
                        if (toggle)
                            R.drawable.baseline_videocam_off_24
                        else
                            R.drawable.baseline_videocam_24
                            ),
                        contentDescription = stringResource(R.string.toggleCameraButton)
                    )
            }



            FilledIconToggleButton(checked = true,
                colors = IconButtonDefaults.filledIconToggleButtonColors(
                    containerColor = Color.DarkGray,
                    checkedContainerColor = WhiteIconColor
                ),
                onCheckedChange = { /*TODO*/ }) {

                var toggle by remember { mutableStateOf(true) }

                    Image(
                        painter = painterResource(id =
                        if (toggle)
                            R.drawable.baseline_mic_off_24
                        else
                            R.drawable.baseline_mic_24
                        ),
                        contentDescription = stringResource(R.string.toggleMicrophoneButton)
                    )

            }
            FilledIconButton(colors = IconButtonDefaults.iconButtonColors(Color.DarkGray),
                onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_waving_hand_24),
                    contentDescription = stringResource(R.string.reactionButton)
                )
            }

            FilledIconButton(colors = IconButtonDefaults.iconButtonColors(RedIconColor),
                onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_call_end_24),
                    contentDescription = stringResource(R.string.endButton)
                )
            }

        }
    }
}


@Preview
@Composable
fun Prew3(){
    BottomButtonSet()
}
