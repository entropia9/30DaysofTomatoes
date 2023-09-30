package com.example.thirtydaysoftomatoes.ui

import com.example.thirtydaysoftomatoes.data.TomatoTip

data class ThirtyDaysUiState(
    val listOfTips: List<TomatoTip> = emptyList()
)