package com.jeff.eldorhubdeliveries.di

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import com.jeff.eldorhubdeliveries.DataBase.UserDao
import com.jeff.eldorhubdeliveries.DataBase.UserDatabase
import com.jeff.eldorhubdeliveries.DataBase.UserDatabase.Companion.DATABASE_NAME
import com.jeff.eldorhubdeliveries.UsereRegisterRepository.UserRegisterRepository
import com.jeff.eldorhubdeliveries.UsereRegisterRepository.UserRegisterRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideShoppingDatabase(
        @ApplicationContext context: Context
    )= Room.databaseBuilder(context,UserDatabase::class.java,DATABASE_NAME)

    @Singleton
    @Provides
    fun provideUserDao(
        database: UserDatabase
    )=database.userDao

}