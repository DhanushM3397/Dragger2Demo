package com.demo.dagger2demo_kotlin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast

import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.dagger2demo_kotlin.adapters.MyRecyclerviewAdapter
import com.demo.dagger2demo_kotlin.adapters.VideoAdapter
import com.demo.dagger2demo_kotlin.databinding.ActivityMainBinding
import com.demo.dagger2demo_kotlin.databinding.AddItemBinding
import com.demo.dagger2demo_kotlin.db.Subscriber
import com.demo.dagger2demo_kotlin.db.SubscriberDAO
import com.demo.dagger2demo_kotlin.db.SubscriberDatabase
import com.demo.dagger2demo_kotlin.db.SubscriberRepositary
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_item.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var addItemBinding: AddItemBinding

    private val viewModel: MainActivityViewModel by viewModels()
    private lateinit var subscriberViewModel: SubscriberViewModel

    private lateinit var videoAdapter: VideoAdapter

    private lateinit var check: String
    private lateinit var checkBoole: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dao: SubscriberDAO = SubscriberDatabase.getInstance(application).subscriberDAO
        val repositary = SubscriberRepositary(dao)
        val factory = SubscriberViewModelFactory(repositary)
        subscriberViewModel = ViewModelProvider(this, factory).get(SubscriberViewModel::class.java)
        binding.myViewModel = subscriberViewModel
        binding.lifecycleOwner = this
        DisplaySubscriberList()
        binding.button.setOnClickListener {
            binding.button.setBackgroundResource(R.drawable.rounded_button_grey);
            binding.button2.setBackgroundResource(R.drawable.rounded_button_skyblue);


            binding.recyclerView.isVisible = true
            binding.feedrecyclerView1.isVisible = false
            binding.floatingActionButton.isVisible = false


        }
        button2.setOnClickListener {
            binding.button2.setBackgroundResource(R.drawable.rounded_button_grey);
            binding.button.setBackgroundResource(R.drawable.rounded_button_skyblue);


            binding.recyclerView.isVisible = false
            binding.feedrecyclerView1.isVisible = true
            binding.floatingActionButton.isVisible = true

        }

        binding.floatingActionButton.setOnClickListener {
            addInfo()
        }
        initRecyclerView()
        initFeedRecyclerView()


    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        videoAdapter = VideoAdapter()
        binding.recyclerView.adapter = videoAdapter
        binding.recyclerView.setHasFixedSize(true)
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

        val addDialog = AlertDialog.Builder(this)
        val inflter = LayoutInflater.from(this)
        addItemBinding =
            DataBindingUtil.inflate(inflter, R.layout.add_item, null, false)


        addDialog.setView(addItemBinding.root)
        addDialog.setPositiveButton("Ok") { dialog, _ ->

            val names = addItemBinding.userName.text.toString()
            if (addItemBinding.simpleCheckBox.isChecked) {
                checkBoole = "1"
                check = "Live"
                Toast.makeText(this, "Still need to implemenation " + check, Toast.LENGTH_SHORT)
                    .show()
            } else {
                checkBoole = "0"
                check = ""
            }


            val simpleDateFormat = SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")
            val currentDateAndTime: String = simpleDateFormat.format(Date())
            val s: String = currentDateAndTime

            subscriberViewModel.saveOrUpdate(names, s, check, checkBoole)
            Toast.makeText(this, "Still need to implemenation ", Toast.LENGTH_SHORT).show()


            dialog.dismiss()
        }
        addDialog.setNegativeButton("Cancel") { dialog, _ ->
            dialog.dismiss()
            Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
            val msg =
                "You have " + (if ((simpleCheckBox.isChecked)) "checked" else "unchecked") + " this Checkbox."
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }
        addDialog.create()
        addDialog.show()
    }

    private fun initFeedRecyclerView() {
        binding.feedrecyclerView1.layoutManager = LinearLayoutManager(this)
        DisplaySubscriberList()
    }

    private fun DisplaySubscriberList() {
        subscriberViewModel.subscribers.observe(this, Observer {
            Log.i("MYTAG", it.toString())
            binding.feedrecyclerView1.adapter = MyRecyclerviewAdapter(it)
        })
    }

    private fun listItemClicked(subscriber: Subscriber) {
        Toast.makeText(this,"Selected name is ${subscriber.name}",Toast.LENGTH_SHORT).show()

    }
}