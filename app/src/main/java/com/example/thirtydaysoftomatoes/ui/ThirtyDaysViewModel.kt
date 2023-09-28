package com.example.thirtydaysoftomatoes.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ThirtyDaysViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ThirtyDaysUiState())
    val uiState: StateFlow<ThirtyDaysUiState> = _uiState
}