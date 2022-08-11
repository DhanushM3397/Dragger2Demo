package com.demo.dagger2demo_kotlin.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
//-------Abstract class------------------

@Database(entities = [Subscriber::class], version = 2)
abstract class SubscriberDatabase : RoomDatabase(){

    abstract  val subscriberDAO :SubscriberDAO

    companion object{

        @Volatile  //its makes the field  immediately made visible to other threads.
        private  var INSTANCE:SubscriberDatabase?=null

        fun getInstance(context:Context):SubscriberDatabase{

            synchronized(this){
                var instance:SubscriberDatabase?= INSTANCE
                if (instance==null){
                    instance=Room.databaseBuilder(context.applicationContext,
                    SubscriberDatabase::class.java,
                        "VPM_DATABASE"
                        ).build()
                }
                return instance
            }
        }
    }
}

