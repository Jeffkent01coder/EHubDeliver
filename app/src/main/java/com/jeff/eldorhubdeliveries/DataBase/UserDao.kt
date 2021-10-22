package com.jeff.eldorhubdeliveries.DataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsers(users: Users)

    @Insert
    suspend fun insert(users: Users)

    @Query("SELECT * FROM Users_Registration ORDER BY userId DESC")
    fun getAllUsers():LiveData<List<Users>>

    @Query("SELECT * FROM Users_Registration WHERE user_name LIKE :userName")
    suspend fun getUsername(userName: String): Users?


}
