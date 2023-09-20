package com.example.thirtydaysoftomatoes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydaysoftomatoes.R

data class TomatoTip(
    val dayNumber:Int,
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    @StringRes val description:Int
)


object TomatoTipsRepository{
    val tomatoTips= listOf(
        TomatoTip(
            dayNumber=1,
            title = R.string.tip1_title,
            image=R.drawable.output1,
            description = R.string.tip1_description
        ),
        TomatoTip(
            dayNumber=2,
            title = R.string.tip2_title,
            image=R.drawable.output2,
            description = R.string.tip2_description
        ),
        TomatoTip(
            dayNumber=3,
            title = R.string.tip3_title,
            image=R.drawable.output3,
            description = R.string.tip3_description
        ),
        TomatoTip(
            dayNumber=4,
            title = R.string.tip4_title,
            image=R.drawable.output4,
            description = R.string.tip4_description
        ),
        TomatoTip(
            dayNumber=5,
            title = R.string.tip5_title,
            image=R.drawable.output5,
            description = R.string.tip5_description
        ),
        TomatoTip(
            dayNumber=6,
            title = R.string.tip6_title,
            image=R.drawable.output6,
            description = R.string.tip6_description
        ),
        TomatoTip(
            dayNumber=7,
            title = R.string.tip7_title,
            image=R.drawable.output7,
            description = R.string.tip7_description
        ),
        TomatoTip(
            dayNumber=8,
            title = R.string.tip8_title,
            image=R.drawable.output8,
            description = R.string.tip8_description
        ),
        TomatoTip(
            dayNumber=9,
            title = R.string.tip9_title,
            image=R.drawable.output9,
            description = R.string.tip9_description
        ),
        TomatoTip(
            dayNumber=10,
            title = R.string.tip10_title,
            image=R.drawable.output10,
            description = R.string.tip10_description
        ),
        TomatoTip(
            dayNumber=11,
            title = R.string.tip11_title,
            image=R.drawable.output11,
            description = R.string.tip11_description
        ),
        TomatoTip(
            dayNumber=12,
            title = R.string.tip12_title,
            image=R.drawable.output12,
            description = R.string.tip12_description
        ),
        TomatoTip(
            dayNumber=13,
            title = R.string.tip13_title,
            image=R.drawable.output13,
            description = R.string.tip13_description
        ),
        TomatoTip(
            dayNumber=14,
            title = R.string.tip14_title,
            image=R.drawable.output14,
            description = R.string.tip14_description
        ),
        TomatoTip(
            dayNumber=15,
            title = R.string.tip15_title,
            image=R.drawable.output15,
            description = R.string.tip15_description
        ),
        TomatoTip(
            dayNumber=16,
            title = R.string.tip16_title,
            image=R.drawable.output16,
            description = R.string.tip16_description
        ),
        TomatoTip(
            dayNumber=17,
            title = R.string.tip17_title,
            image=R.drawable.output17,
            description = R.string.tip17_description
        ),
        TomatoTip(
            dayNumber=18,
            title = R.string.tip18_title,
            image=R.drawable.output18,
            description = R.string.tip18_description
        ),
        TomatoTip(
            dayNumber=19,
            title = R.string.tip19_title,
            image=R.drawable.output19,
            description = R.string.tip19_description
        ),
        TomatoTip(
            dayNumber=20,
            title = R.string.tip20_title,
            image=R.drawable.output20,
            description = R.string.tip20_description
        ),
        TomatoTip(
            dayNumber=21,
            title = R.string.tip21_title,
            image=R.drawable.output21,
            description = R.string.tip21_description
        ),
        TomatoTip(
            dayNumber=22,
            title = R.string.tip22_title,
            image=R.drawable.output22,
            description = R.string.tip22_description
        ),
        TomatoTip(
            dayNumber=23,
            title = R.string.tip23_title,
            image=R.drawable.output23,
            description = R.string.tip23_description
        ),
        TomatoTip(
            dayNumber=24,
            title = R.string.tip24_title,
            image=R.drawable.output24,
            description = R.string.tip24_description
        ),
        TomatoTip(
            dayNumber=25,
            title = R.string.tip25_title,
            image=R.drawable.output25,
            description = R.string.tip25_description
        ),
        TomatoTip(
            dayNumber=26,
            title = R.string.tip26_title,
            image=R.drawable.output26,
            description = R.string.tip26_description
        ),
        TomatoTip(
            dayNumber=27,
            title = R.string.tip27_title,
            image=R.drawable.output27,
            description = R.string.tip27_description
        ),
        TomatoTip(
            dayNumber=28,
            title = R.string.tip28_title,
            image=R.drawable.output28,
            description = R.string.tip28_description
        ),
        TomatoTip(
            dayNumber=29,
            title = R.string.tip29_title,
            image=R.drawable.output29,
            description = R.string.tip29_description
        ),
        TomatoTip(
            dayNumber=30,
            title = R.string.tip30_title,
            image=R.drawable.output30,
            description = R.string.tip30_description
        )
    )
}
