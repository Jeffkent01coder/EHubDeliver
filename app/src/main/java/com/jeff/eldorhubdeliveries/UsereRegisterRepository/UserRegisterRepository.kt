package com.jeff.eldorhubdeliveries.UsereRegisterRepository

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jeff.eldorhubdeliveries.DataBase.Users

interface UserRegisterRepository {

    suspend fun insertUsers(users: Users)

    fun getAllUsers(): LiveData<List<Users>>

    suspend fun getUsername(userName: String): Users?

}