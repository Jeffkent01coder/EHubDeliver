package com.jeff.eldorhubdeliveries.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jeff.eldorhubdeliveries.DataBase.Users
import com.jeff.eldorhubdeliveries.UsereRegisterRepository.UserRegisterRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val repositoryImpl: UserRegisterRepositoryImpl) : ViewModel() {

    lateinit var userData : MutableLiveData<List<Users>>

    init {
        userData = MutableLiveData()
    }

    fun getRecordsObserver() : MutableLiveData<List<Users>>{
        return userData
    }

    fun loadRecords(){

        val list = repositoryImpl.getAllUsers()
        userData.postValue(List<List>)
    }

    suspend fun insertUsers(users: Users){
        repositoryImpl.insertUsers(users)
        loadRecords()
    }
}

