package com.example.thirtydaysoftomatoes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydaysoftomatoes.R

data class TomatoTip(
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    @StringRes val description:Int
)


object TomatoTipsRepository{
    val tomatoTips= listOf(
        TomatoTip(
            title = R.string.tip1_title,
            image=0,
            description = R.string.tip1_description
        )
    )
}
