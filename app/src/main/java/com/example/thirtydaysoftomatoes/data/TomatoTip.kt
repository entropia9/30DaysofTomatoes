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
    val tomatoTips= mapOf(
        1 to TomatoTip(
            title = R.string.tip1_title,
            image=R.drawable.output1,
            description = R.string.tip1_description
        ),
        2 to TomatoTip(
            title = R.string.tip2_title,
            image=R.drawable.output2,
            description = R.string.tip2_description
        ),
        3 to TomatoTip(
            title = R.string.tip3_title,
            image=R.drawable.output3,
            description = R.string.tip3_description
        ),
        4 to TomatoTip(
            title = R.string.tip4_title,
            image=R.drawable.output4,
            description = R.string.tip4_description
        ),
        5 to TomatoTip(
            title = R.string.tip5_title,
            image=R.drawable.output5,
            description = R.string.tip5_description
        ),
        6 to TomatoTip(
            title = R.string.tip6_title,
            image=R.drawable.output6,
            description = R.string.tip6_description
        ),
        7 to TomatoTip(
            title = R.string.tip7_title,
            image=R.drawable.output7,
            description = R.string.tip7_description
        ),
        8 to TomatoTip(
            title = R.string.tip8_title,
            image=R.drawable.output8,
            description = R.string.tip8_description
        ),
        9 to TomatoTip(
            title = R.string.tip9_title,
            image=R.drawable.output9,
            description = R.string.tip9_description
        ),
        10 to TomatoTip(
            title = R.string.tip10_title,
            image=R.drawable.output10,
            description = R.string.tip10_description
        ),
        11 to TomatoTip(
            title = R.string.tip11_title,
            image=R.drawable.output11,
            description = R.string.tip11_description
        ),
        12 to TomatoTip(
            title = R.string.tip12_title,
            image=R.drawable.output12,
            description = R.string.tip12_description
        ),
        13 to TomatoTip(
            title = R.string.tip13_title,
            image=R.drawable.output13,
            description = R.string.tip13_description
        ),
        14 to TomatoTip(
            title = R.string.tip14_title,
            image=R.drawable.output14,
            description = R.string.tip14_description
        ),
        15 to TomatoTip(
            title = R.string.tip15_title,
            image=R.drawable.output15,
            description = R.string.tip15_description
        ),
        16 to TomatoTip(
            title = R.string.tip16_title,
            image=R.drawable.output16,
            description = R.string.tip16_description
        ),
        17 to TomatoTip(
            title = R.string.tip17_title,
            image=R.drawable.output17,
            description = R.string.tip17_description
        ),
        18 to TomatoTip(
            title = R.string.tip18_title,
            image=R.drawable.output18,
            description = R.string.tip18_description
        ),
        19 to TomatoTip(
            title = R.string.tip19_title,
            image=R.drawable.output19,
            description = R.string.tip19_description
        ),
        20 to TomatoTip(
            title = R.string.tip20_title,
            image=R.drawable.output20,
            description = R.string.tip20_description
        ),
        21 to TomatoTip(
            title = R.string.tip21_title,
            image=R.drawable.output21,
            description = R.string.tip21_description
        ),
        22 to TomatoTip(
            title = R.string.tip22_title,
            image=R.drawable.output22,
            description = R.string.tip22_description
        ),
        23 to TomatoTip(
            title = R.string.tip23_title,
            image=R.drawable.output23,
            description = R.string.tip23_description
        ),
        24 to TomatoTip(
            title = R.string.tip24_title,
            image=R.drawable.output24,
            description = R.string.tip24_description
        ),
        25 to TomatoTip(
            title = R.string.tip25_title,
            image=R.drawable.output25,
            description = R.string.tip25_description
        ),
        26 to TomatoTip(
            title = R.string.tip26_title,
            image=R.drawable.output26,
            description = R.string.tip26_description
        ),
        27 to TomatoTip(
            title = R.string.tip27_title,
            image=R.drawable.output27,
            description = R.string.tip27_description
        ),
        28 to TomatoTip(
            title = R.string.tip28_title,
            image=R.drawable.output28,
            description = R.string.tip28_description
        ),
        29 to TomatoTip(
            title = R.string.tip29_title,
            image=R.drawable.output29,
            description = R.string.tip29_description
        ),
        30 to TomatoTip(
            title = R.string.tip30_title,
            image=R.drawable.output30,
            description = R.string.tip30_description
        )
    )
}
