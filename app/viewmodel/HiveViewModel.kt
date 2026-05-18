package com.example.madhumarga.viewmodel

import androidx.lifecycle.ViewModel

class HiveViewModel : ViewModel() {
    fun getAdvice(): String {
        return "Inspect hive regularly for better yield."
    }
}
