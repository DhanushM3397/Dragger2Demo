package com.demo.dagger2demo_kotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.demo.dagger2demo_kotlin.R
import com.demo.dagger2demo_kotlin.databinding.ListItemBinding
import com.demo.dagger2demo_kotlin.db.Subscriber

class MyRecyclerviewAdapter(
    val context: Context,
    private val subscribersList: List<Subscriber>,
    private val clickLister: (Subscriber) -> Unit
) :
    RecyclerView.Adapter<MyRecyclerviewAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.list_item, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(subscribersList[position], clickLister)
    }

    override fun getItemCount(): Int {
        return subscribersList.size
    }


    inner class MyViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(subscriber: Subscriber, clickLister: (Subscriber) -> Unit) {
            binding.nameText.text = subscriber.name

            if (subscriber.isLive.equals("Live")) {
                binding.emailText.isVisible = true
                binding.emailText.text = subscriber.isLive
            } else {
                binding.emailText.isVisible = false
            }

            binding.listItemLayout.setOnClickListener {
                clickLister(subscriber)

            }

        }


    }
}