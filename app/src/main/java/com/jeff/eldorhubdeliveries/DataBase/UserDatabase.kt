package com.jeff.eldorhubdeliveries.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Users::class], version = 1, exportSchema = false)
abstract class UserDatabase: RoomDatabase() {

    abstract val userDao : UserDao

    companion object{
        @Volatile
        private var INSTANCE : UserDatabase? = null

        fun getInstance(context: Context): UserDatabase? {
            synchronized(this){

                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase::class.java,
                        "user_details_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    instance = INSTANCE
                }
                return instance

            }

        }
    }
}
