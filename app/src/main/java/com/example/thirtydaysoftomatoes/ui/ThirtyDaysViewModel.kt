package com.example.thirtydaysoftomatoes.ui

import androidx.lifecycle.ViewModel
import com.example.thirtydaysoftomatoes.data.TomatoTipsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ThirtyDaysViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        ThirtyDaysUiState(
            TomatoTipsRepository.tomatoTips
        )
    )
    val uiState: StateFlow<ThirtyDaysUiState> = _uiState

}