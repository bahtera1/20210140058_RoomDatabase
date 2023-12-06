package com.example.activity7.model

import androidx.lifecycle.ViewModel
import com.example.activity7.repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel(){
    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }
}