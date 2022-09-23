package com.ciandt.instagramui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TopBar(nickname = "phillip-lacknner")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(5.dp))
        ProfileSection()
    }
}




