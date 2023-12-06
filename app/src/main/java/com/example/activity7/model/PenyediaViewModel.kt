package com.example.activity7.model

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory


object PenyediaViewModel{

    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
    }
/**
 * Fungsi ekstensi query untuk objek Application dan mengembalikan sebuah instance dari AplikasiSiswa
 */