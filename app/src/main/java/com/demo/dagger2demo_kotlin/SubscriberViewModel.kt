package com.demo.dagger2demo_kotlin


import androidx.databinding.Observable

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demo.dagger2demo_kotlin.db.Subscriber
import com.demo.dagger2demo_kotlin.db.SubscriberRepositary
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


//------------View Model Class--------------------

class SubscriberViewModel(private val repositary: SubscriberRepositary) : ViewModel(), Observable {
    val subscribers = repositary.subscribers
    private var isUpdateorDelete = false
    private lateinit var subscriberToUpdateOrDelete: Subscriber


    fun save(name: String, email: String, isLive: String, isliveBoolean: String) {
        insert(Subscriber(0, name, email, isLive, isliveBoolean))

    }

    //------------update the  particular  recyclerview item---------------------
    fun itemUpdate(isLive: String) {
        if (isUpdateorDelete) {

            subscriberToUpdateOrDelete.isLive = isLive
            update(subscriberToUpdateOrDelete)

        }
    }

    fun clearAllorDelete() {
        clearAll()
    }

    private fun insert(subscriber: Subscriber): Job = viewModelScope.launch {
        repositary.insert(subscriber)
    }

    private fun update(subscriber: Subscriber): Job = viewModelScope.launch {
        repositary.update(subscriber)
    }

    fun delete(subscriber: Subscriber): Job = viewModelScope.launch {
        repositary.delete(subscriber)
    }

    private fun clearAll(): Job = viewModelScope.launch {
        repositary.deleteAll()
    }

    fun initUpdateandDelete(subscriber: Subscriber) {
        //  inputName.value = subscriber.name
        isUpdateorDelete = true
        subscriberToUpdateOrDelete = subscriber
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {


    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }


}