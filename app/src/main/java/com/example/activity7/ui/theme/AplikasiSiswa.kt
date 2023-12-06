package com.example.activity7.ui.theme

import android.app.Application
import com.example.activity7.repositori.ContainerApp
import com.example.activity7.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
     * App Container instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}