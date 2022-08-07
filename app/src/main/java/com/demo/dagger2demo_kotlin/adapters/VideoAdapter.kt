package com.demo.dagger2demo_kotlin.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.demo.dagger2demo_kotlin.R
import com.demo.dagger2demo_kotlin.model.RecyclerData
import kotlinx.android.synthetic.main.recycler_view_list_row.view.*

class VideoAdapter :  PagingDataAdapter<RecyclerData,
        VideoAdapter.MyViewHolder>(diffCallback) {

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageView = view.imageView
        val textviewName = view.textviewName
        val textviewDescription = view.textviewDescription

        fun bind(data: RecyclerData) {
            textviewName.setText(data.first_name)
            textviewDescription.setText(data.last_name)

            Glide.with(imageView)
                .load(data.avatar)
                .apply(RequestOptions.centerCropTransform())
                .into(imageView)
        }
    }

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<RecyclerData>() {
            override fun areItemsTheSame(oldItem: RecyclerData, newItem: RecyclerData): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: RecyclerData, newItem: RecyclerData): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        getItem(position)?.let {
           // Log.d("aaa1",it.first_name)
            holder.bind(it)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_list_row, parent, false)
        return MyViewHolder(view)
    }
}