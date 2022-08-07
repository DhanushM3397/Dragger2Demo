package com.demo.dagger2demo_kotlin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.dagger2demo_kotlin.adapters.VideoAdapter
import com.demo.dagger2demo_kotlin.model.RecyclerList
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
        private lateinit var videoAdapter : VideoAdapter
         private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      button.setOnClickListener {
          button.setBackgroundResource(R.drawable.rounded_button_grey);
          button2.setBackgroundResource(R.drawable.rounded_button_red);


            recyclerView.isVisible=true
            recyclerView1.isVisible=false
            floatingActionButton.isVisible=false


        }
        button2.setOnClickListener {
            button2.setBackgroundResource(R.drawable.rounded_button_grey);
            button.setBackgroundResource(R.drawable.rounded_button_red);


            recyclerView.isVisible=false
            recyclerView1.isVisible=true
            floatingActionButton.isVisible=true

        }

        floatingActionButton.setOnClickListener {
            addInfo()
        }
        initRecyclerView()

    }

    private fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        videoAdapter = VideoAdapter()
        recyclerView.adapter = videoAdapter
        recyclerView.setHasFixedSize(true)
        loadData()
    }

    private fun loadData() {

        lifecycleScope.launch {
            viewModel.listData.collect {
                Log.d("aaa", "load: $it")
                videoAdapter.submitData(it)
                videoAdapter.notifyDataSetChanged()
            }
        }
    }

    private fun addInfo() {
        val inflter = LayoutInflater.from(this)
        val v = inflter.inflate(R.layout.add_item,null)
        /**set view*/
        val userName = v.findViewById<EditText>(R.id.userName)
      //  val userNo = v.findViewById<EditText>(R.id.userNo)

        val addDialog = AlertDialog.Builder(this)

        addDialog.setView(v)
        addDialog.setPositiveButton("Ok"){
                dialog,_->
            val names = userName.text.toString()


            Toast.makeText(this,"Still need to implemenation ",Toast.LENGTH_SHORT).show()


            dialog.dismiss()
        }
        addDialog.setNegativeButton("Cancel"){
                dialog,_->
            dialog.dismiss()
            Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()

        }
        addDialog.create()
        addDialog.show()
    }

}