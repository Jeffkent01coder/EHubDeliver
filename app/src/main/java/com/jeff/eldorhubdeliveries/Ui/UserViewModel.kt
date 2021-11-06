package com.jeff.eldorhubdeliveries.Ui

import com.jeff.eldorhubdeliveries.UsereRegisterRepository.UserRegisterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val repository: UserRegisterRepository){
    val getAllUser= repository.getAllUsers()




}