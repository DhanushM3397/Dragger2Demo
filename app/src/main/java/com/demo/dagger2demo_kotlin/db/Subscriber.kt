package com.demo.dagger2demo_kotlin.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//----Entity Class---------
@Entity(tableName = "vpm_room")
data class Subscriber(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "subscriber_id")
    val id: Int,

    @ColumnInfo(name = "subscriber_name")
    var name: String,


    @ColumnInfo(name = "subscriber_Date")
    val date: String,

    @ColumnInfo(name = "subscriber_isLive")
    var isLive: String,

    @ColumnInfo(name = "sub_isLiveBoolean")
    val isLiveBoolean: String
)