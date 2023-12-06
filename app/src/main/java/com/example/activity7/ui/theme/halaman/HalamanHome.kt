package com.example.activity7.ui.theme.halaman

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.activity7.R
import com.example.activity7.data.Siswa
import com.example.activity7.navigasi.DestinasiNavigasi


object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}

@Composable
fun DataSiswa(
    siswa: Siswa,
    modifier: Modifier = Modifier
){}