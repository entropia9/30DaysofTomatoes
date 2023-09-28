package com.example.thirtydaysoftomatoes.ui

import com.example.thirtydaysoftomatoes.data.TomatoTip
import com.example.thirtydaysoftomatoes.data.TomatoTipsRepository

data class ThirtyDaysUiState(
    val listOfTips: List<TomatoTip> = emptyList(),
    val currentTomatoTip: TomatoTip = TomatoTipsRepository.tomatoTips.first()
)