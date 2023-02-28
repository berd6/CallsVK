package com.example.callsvk

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.provider.ContactsContract
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat

@Composable
fun TopButtonSet() {

    Column(modifier = Modifier.padding(16.dp)) {


        Button(
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .height(32.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_keyboard_arrow_down_24),
                contentDescription = null
            )
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_chat_bubble_outline_24),
                    contentDescription = stringResource(R.string.messagesButton)
                )
            }
            Button(
                onClick = {
                    // if (hasContactPermission(context)) {
                    //     val intent = Intent(Intent.ACTION_GET_CONTENT)
                    //     intent.type = ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE
                    //   startActivityForResult(activity, intent, 1, null)
                    // } else { }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.outline_group_24),
                        contentDescription = stringResource(R.string.groupButton)
                    )
                }

            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.outline_space_dashboard),
                    contentDescription = stringResource(R.string.change_video_previews)
                )
            }
            fun hasContactPermission(context: Context): Boolean {
                return ContextCompat.checkSelfPermission(
                    context,
                    Manifest.permission.READ_CONTACTS
                ) ==
                        PackageManager.PERMISSION_GRANTED;
            }

            fun requestContactPermission(context: Context, activity: Activity) {
                if (!hasContactPermission(context)) {
                    ActivityCompat.requestPermissions(
                        activity,
                        arrayOf(Manifest.permission.READ_CONTACTS),
                        1
                    )
                }
            }
        }
        fun hasContactPermission(context: Context): Boolean {
            return ContextCompat.checkSelfPermission(context, Manifest.permission.READ_CONTACTS) ==
                    PackageManager.PERMISSION_GRANTED;
        }

        fun requestContactPermission(context: Context, activity: Activity) {
            if (!hasContactPermission(context)) {
                ActivityCompat.requestPermissions(
                    activity,
                    arrayOf(Manifest.permission.READ_CONTACTS),
                    1
                )
            }
        }
    }
}

@Preview
@Composable
fun Prew1(){
    TopButtonSet()
}







