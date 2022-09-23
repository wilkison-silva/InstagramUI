package com.ciandt.instagramui.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround

    ) {
        RoundedImage(modifier = Modifier.weight(3f))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.weight(7f)
        ) {
            ProfileStat(number = "601", text = "Posts")
            ProfileStat(number = "99.8K", text = "Followers")
            ProfileStat(number = "72", text = "Following")
        }
    }
}

@Composable
fun ProfileStat(
    number: String,
    text: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = number,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = text,
            color = Color.Gray
        )
    }
}