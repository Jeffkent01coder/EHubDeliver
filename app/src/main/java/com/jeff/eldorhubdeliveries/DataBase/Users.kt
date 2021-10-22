package com.jeff.eldorhubdeliveries.DataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Users_Registration")
data class Users (

    @PrimaryKey(autoGenerate = true)
    var userId: Int = 0,

    @ColumnInfo(name = "User_Name")
    val name: String,

    @ColumnInfo(name = "User_Email")
    val email: String,

    @ColumnInfo(name = "User_Phone")
    val phone: Int,

    @ColumnInfo(name = "User_Password")
    val password: String,
)