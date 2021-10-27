package com.jeff.eldorhubdeliveries.DataBase


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Users::class], version = 1, exportSchema = false)
abstract class UserDatabase: RoomDatabase() {

    abstract val userDao : UserDao

    companion object{

     const val DATABASE_NAME = "user_db"


    }
}
