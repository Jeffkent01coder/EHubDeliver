package com.jeff.eldorhubdeliveries.UsereRegisterRepository

import androidx.lifecycle.LiveData
import com.jeff.eldorhubdeliveries.DataBase.UserDao
import com.jeff.eldorhubdeliveries.DataBase.Users
import javax.inject.Inject

class UserRegisterRepositoryImpl @Inject constructor(private val dao: UserDao):UserRegisterRepository {

    override suspend fun insertUsers(users: Users) {
        dao.insertUsers(users)
    }

    override fun getAllUsers(): LiveData<List<Users>> {
       return dao.getAllUsers()
    }

    override suspend fun getUsername(userName: String): Users? {
       return dao.getUsername(userName)
    }

}