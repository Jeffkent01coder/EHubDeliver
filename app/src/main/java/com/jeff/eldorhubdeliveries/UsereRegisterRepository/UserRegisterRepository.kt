package com.jeff.eldorhubdeliveries.UsereRegisterRepository

import com.jeff.eldorhubdeliveries.DataBase.UserDao
import com.jeff.eldorhubdeliveries.DataBase.Users

class UserRegisterRepository(private val dao: UserDao) {
    val users = dao.getAllUsers()

    suspend fun insert(user: Users) {
        return dao.insert(user)
    }

    suspend fun getUserName(userName: String):Users?{
        return dao.getUsername(userName)
    }
}