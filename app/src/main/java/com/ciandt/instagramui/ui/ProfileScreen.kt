package com.ciandt.instagramui.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ciandt.instagramui.R

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TopBar(nickname = "phillip-lacknner")
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
        )
        ProfileSection()
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
        )
        ButtonSection()
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
        )
        HighlightSection()
    }
}

@Composable
fun HighlightSection(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        HighlightItem(
            imageRes = R.drawable.youtube,
            title = "YouTube",
        )
        HighlightItem(
            imageRes = R.drawable.qa,
            title = "Q&A",
        )
        HighlightItem(
            imageRes = R.drawable.discord,
            title = "Discord",
        )
        HighlightItem(
            imageRes = R.drawable.telegram,
            title = "Telegram",
        )
    }
}

@Composable
fun HighlightItem(
    @DrawableRes imageRes: Int,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(end = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        RoundedImage(
            size = 70.dp,
            imageRes = imageRes
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = title,
            fontSize = 12.sp,
            color = Color.Black,
        )
    }














}