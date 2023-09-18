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
        ),
        TomatoTip(
            title = R.string.tip2_title,
            image=0,
            description = R.string.tip2_description
        ),
        TomatoTip(
            title = R.string.tip3_title,
            image=0,
            description = R.string.tip3_description
        ),
        TomatoTip(
            title = R.string.tip4_title,
            image=0,
            description = R.string.tip4_description
        ),
        TomatoTip(
            title = R.string.tip5_title,
            image=0,
            description = R.string.tip5_description
        ),
        TomatoTip(
            title = R.string.tip6_title,
            image=0,
            description = R.string.tip6_description
        ),
        TomatoTip(
            title = R.string.tip7_title,
            image=0,
            description = R.string.tip7_description
        ),
        TomatoTip(
            title = R.string.tip8_title,
            image=0,
            description = R.string.tip8_description
        ),
        TomatoTip(
            title = R.string.tip9_title,
            image=0,
            description = R.string.tip9_description
        ),
        TomatoTip(
            title = R.string.tip10_title,
            image=0,
            description = R.string.tip10_description
        ),
        TomatoTip(
            title = R.string.tip11_title,
            image=0,
            description = R.string.tip11_description
        ),
        TomatoTip(
            title = R.string.tip12_title,
            image=0,
            description = R.string.tip12_description
        ),
        TomatoTip(
            title = R.string.tip13_title,
            image=0,
            description = R.string.tip13_description
        ),
        TomatoTip(
            title = R.string.tip14_title,
            image=0,
            description = R.string.tip14_description
        ),
        TomatoTip(
            title = R.string.tip15_title,
            image=0,
            description = R.string.tip15_description
        ),
        TomatoTip(
            title = R.string.tip16_title,
            image=0,
            description = R.string.tip16_description
        ),
        TomatoTip(
            title = R.string.tip17_title,
            image=0,
            description = R.string.tip17_description
        ),
        TomatoTip(
            title = R.string.tip18_title,
            image=0,
            description = R.string.tip18_description
        ),
        TomatoTip(
            title = R.string.tip19_title,
            image=0,
            description = R.string.tip19_description
        ),
        TomatoTip(
            title = R.string.tip20_title,
            image=0,
            description = R.string.tip20_description
        ),
        TomatoTip(
            title = R.string.tip21_title,
            image=0,
            description = R.string.tip21_description
        ),
        TomatoTip(
            title = R.string.tip22_title,
            image=0,
            description = R.string.tip22_description
        ),
        TomatoTip(
            title = R.string.tip23_title,
            image=0,
            description = R.string.tip23_description
        ),
        TomatoTip(
            title = R.string.tip24_title,
            image=0,
            description = R.string.tip24_description
        ),
        TomatoTip(
            title = R.string.tip25_title,
            image=0,
            description = R.string.tip25_description
        ),
        TomatoTip(
            title = R.string.tip26_title,
            image=0,
            description = R.string.tip26_description
        ),
        TomatoTip(
            title = R.string.tip27_title,
            image=0,
            description = R.string.tip27_description
        ),
        TomatoTip(
            title = R.string.tip28_title,
            image=0,
            description = R.string.tip28_description
        ),
        TomatoTip(
            title = R.string.tip29_title,
            image=0,
            description = R.string.tip29_description
        ),
        TomatoTip(
            title = R.string.tip30_title,
            image=0,
            description = R.string.tip30_description
        )
    )
}
