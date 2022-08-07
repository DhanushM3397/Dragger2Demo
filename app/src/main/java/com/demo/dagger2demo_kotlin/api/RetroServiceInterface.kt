package com.demo.dagger2demo_kotlin.api

import com.demo.dagger2demo_kotlin.model.RecyclerList
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroServiceInterface {

    @GET("users/")
    suspend fun getDataFromAPI(@Query("page")query: String): Response<RecyclerList>
}