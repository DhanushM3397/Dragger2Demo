package com.demo.dagger2demo_kotlin

import android.app.Application
import androidx.lifecycle.*
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.demo.dagger2demo_kotlin.api.RetroServiceInterface
import com.demo.dagger2demo_kotlin.model.RecyclerList
import com.demo.dagger2demo_kotlin.paging.VideoPaging
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val retroServiceInterface: RetroServiceInterface
) : ViewModel() {

    val listData = Pager(PagingConfig(pageSize = 1, enablePlaceholders = false)) {
        VideoPaging(retroServiceInterface)

    }.flow.cachedIn(viewModelScope)


}