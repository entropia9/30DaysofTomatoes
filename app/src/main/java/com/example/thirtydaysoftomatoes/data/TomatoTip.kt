package com.example.thirtydaysoftomatoes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TomatoTip(
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    @StringRes val description:Int
)
