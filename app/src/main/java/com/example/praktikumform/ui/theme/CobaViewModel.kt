package com.example.praktikumform.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.praktikumform.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel() {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var alamat : String by mutableStateOf("")
        private set
    var statusK : String by mutableStateOf("")
        private set
    private  val _uiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String,tlp:String,email:String, jk:String, almt:String, st:String){
        namaUsr=nm;
        noTlp=tlp;
        this.email =email;
        jenisKl=jk;
        alamat=almt;
        statusK=st
    }

    fun setJenisK(pilihJk:String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJk) }
    }
    fun setStatus(pilihSt:String){
        _uiState.update { currentState -> currentState.copy(sex = pilihSt) }
    }
    fun BacaData(nm: String, tlp: String, email: String, jk: String, almt: String) {

    }
}