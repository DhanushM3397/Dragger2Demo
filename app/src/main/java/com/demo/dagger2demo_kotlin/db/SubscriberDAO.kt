package com.demo.dagger2demo_kotlin.db
import androidx.room.Dao
import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Query

// ----------- DAO Class-----------------
@Dao
interface SubscriberDAO {

   @Insert
    suspend fun insertSubscriber(subscriber: Subscriber)


    @Update
    suspend fun updateSubscriber(subscriber: Subscriber)

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber)

    @Query("DELETE FROM vpm_room")
    suspend fun deleteAll()


    @Query("SELECT * FROM vpm_room ORDER BY subscriber_isLive DESC ")

    fun getAllSubscribers():LiveData<List<Subscriber>>
}