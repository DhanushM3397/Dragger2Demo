package com.demo.dagger2demo_kotlin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.demo.dagger2demo_kotlin.db.SubscriberRepositary
import java.lang.IllegalArgumentException
//------------------ViewModel Factory Class-------------------
class SubscriberViewModelFactory(private  val repositary: SubscriberRepositary) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SubscriberViewModel::class.java)){
            return SubscriberViewModel(repositary) as T
        }
        throw  IllegalArgumentException("Unknown")
    }

}