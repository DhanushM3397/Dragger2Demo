package com.demo.dagger2demo_kotlin.paging

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.demo.dagger2demo_kotlin.api.RetroServiceInterface
import com.demo.dagger2demo_kotlin.model.RecyclerData

class VideoPaging(
    private val apiService: RetroServiceInterface
): PagingSource<Int, RecyclerData>() {
    override fun getRefreshKey(state: PagingState<Int, RecyclerData>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, RecyclerData> {
        return try {
            val currentPage = params.key ?: 1
            val response = apiService.getDataFromAPI(  "$currentPage")
            val responseData = mutableListOf<RecyclerData>()
            val data = response.body()?.data ?: emptyList()
            Log.d("aaa",data[0].first_name)
            responseData.addAll(data)

            LoadResult.Page(
                data = responseData,
                prevKey = if (currentPage == 1) null else -1,
                nextKey = currentPage.plus(1)
            )
        }catch (e : Exception){
            e.message?.let { Log.d("aaa", it) }
            LoadResult.Error(e)
        }
    }
}