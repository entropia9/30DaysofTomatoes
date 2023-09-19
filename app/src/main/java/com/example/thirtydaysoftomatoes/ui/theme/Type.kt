package com.example.thirtydaysoftomatoes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.thirtydaysoftomatoes.R

val CroissantOne:FontFamily= FontFamily(
        Font(R.font.croissant_one_regular)
)
val Bitter:FontFamily=FontFamily(
    Font(R.font.bitter_regular),
    Font(R.font.bitter_semibold),
    Font(R.font.bitter_bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Bitter,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    titleLarge = TextStyle(
        fontFamily = CroissantOne,
        fontWeight = FontWeight.Normal,
        fontSize = 26.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    titleMedium = TextStyle(
        fontFamily = Bitter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
    ),

)