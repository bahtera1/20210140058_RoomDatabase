package com.example.activity7.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.activity7.data.Siswa
import com.example.activity7.repositori.RepositoriSiswa

class EntryViewModel (private val repositoriSiswa: RepositoriSiswa): ViewModel(){
    /**
     * berisi status siswa saat ini
     */
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    /**
     * Fungsi Untuk Validasi Input
     */
    private fun ValidasiInput(uiState:DetailSiswa= uiStateSiswa.detailSiswa):Boolean{
        return with(uiState){
            nama.isNotBlank() &&alamat.isNotBlank() && telpon.isNotBlank()
        }
    }

    fun updateUIState(detailSiswa: DetailSiswa){
        uiStateSiswa=
            UIStateSiswa(detailSiswa=detailSiswa,isEntryValid = ValidasiInput(detailSiswa))
    }

    /**
     * fungsi untuk menyimpan data di entry
     */
    suspend fun saveSiswa(){
        if (ValidasiInput()){
            repositoriSiswa.insertSiswa(uiStateSiswa.detailSiswa.toSiswa())
        }
    }

}

/**
 * mewakili status ui untuk siswa
 */
data class UIStateSiswa(
    val detailSiswa: DetailSiswa= DetailSiswa(),
    val isEntryValid: Boolean=false
)

data class DetailSiswa(
    val id :Int = 0,
    val nama: String="",
    val alamat: String="",
    val telpon: String="",
)



fun DetailSiswa.toSiswa(): Siswa=Siswa(
    id=id,
    nama = nama,
    alamat = alamat,
    telpon=telpon
)
fun Siswa.toUIStateSiswa(isEntryValid:Boolean =false): UIStateSiswa =UIStateSiswa(
    detailSiswa = this.toDetailSiswa(),
    isEntryValid=isEntryValid
)
fun Siswa.toDetailSiswa(): DetailSiswa= DetailSiswa(
    id=id,
    nama=nama,
    alamat=alamat,
    telpon=telpon
)