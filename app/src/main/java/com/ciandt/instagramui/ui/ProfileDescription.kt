package com.ciandt.instagramui.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileDescription() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 19.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Programming Mentor",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            letterSpacing = 0.5.sp,
            lineHeight = 20.sp,
        )
        Text(
            text = "10 years of coding experience\n" +
                    "Want me to make your app? Send me an email!\n" +
                    "Subscribe to my Youtube channel",
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            letterSpacing = 0.5.sp,
            lineHeight = 20.sp,
        )
        Text(
            text = "https://youtube.com/c/PhillipLackner",
            color = Color.Blue,
            letterSpacing = 0.5.sp,
            lineHeight = 20.sp,
        )
        Text(
            text = buildAnnotatedString {
                val boldStyle = SpanStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                append("Followed by ")
                pushStyle(boldStyle)
                append("codinginflow")
                pop()
                append(", ")
                pushStyle(boldStyle)
                append("miakhalifa")
                pop()
                append(" and ")
                pushStyle(boldStyle)
                append("17 others")
            },
            letterSpacing = 0.5.sp,
            color = Color.Black,
            lineHeight = 20.sp,
        )
    }
}