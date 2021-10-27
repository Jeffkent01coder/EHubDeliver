package com.jeff.eldorhubdeliveries.vm

import com.jeff.eldorhubdeliveries.UsereRegisterRepository.UserRegisterRepository
import com.jeff.eldorhubdeliveries.UsereRegisterRepository.UserRegisterRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val repository: UserRegisterRepository){
    val getAllUser= repository.getAllUsers()


}