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
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var addItemBinding: AddItemBinding

    //-------ViewModel Declaration---------------------
    private val viewModel: MainActivityViewModel by viewModels()
    private lateinit var subscriberViewModel: SubscriberViewModel

    private lateinit var videoAdapter: VideoAdapter
    //private lateinit var myRecyclerviewAdapter: MyRecyclerviewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //----------Abstract class initialization-----------------
        val dao: SubscriberDAO = SubscriberDatabase.getInstance(application).subscriberDAO
        //---------Abstract Class repository Initializatiom---------
        val repository = SubscriberRepositary(dao)
        //----pass the repository instance into  ViewModelFactory class
        val factory = SubscriberViewModelFactory(repository)
        // initialization of View model
        subscriberViewModel = ViewModelProvider(this, factory).get(SubscriberViewModel::class.java)
        binding.myViewModel = subscriberViewModel
        binding.lifecycleOwner = this

        binding.button.setOnClickListener {
            binding.button.setBackgroundResource(R.drawable.rounded_button_grey)
            binding.button2.setBackgroundResource(R.drawable.rounded_button_skyblue)


            binding.recyclerView.isVisible = true
            binding.feedrecyclerView1.isVisible = false
            binding.floatingActionButton.isVisible = false


        }
        button2.setOnClickListener {
            binding.button2.setBackgroundResource(R.drawable.rounded_button_grey)
            binding.button.setBackgroundResource(R.drawable.rounded_button_skyblue)


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


    //--------- insert------------------------
    private fun addInfo() {

        val addDialog = AlertDialog.Builder(this)
        val inflter = LayoutInflater.from(this)
        addItemBinding =
            DataBindingUtil.inflate(inflter, R.layout.add_item, null, false)
        //addItemBinding.userName.setText(subscriber.name)
        addItemBinding.alertText.setText("Data Insert")
        lateinit var check: String
        lateinit var checkBoole: String
        addDialog.setView(addItemBinding.root)
        addDialog.setPositiveButton("Ok") { dialog, _ ->

            val names = addItemBinding.userName.text.toString()
            if (addItemBinding.simpleCheckBox.isChecked) {
                checkBoole = "1"
                check = "Live"
            } else {
                checkBoole = "0"
                check = ""
            }


            val simpleDateFormat = SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")
            val currentDateAndTime: String = simpleDateFormat.format(Date())
            val s: String = currentDateAndTime

            subscriberViewModel.save(names, s, check, checkBoole)
            Toast.makeText(this, "Data is Inserted", Toast.LENGTH_SHORT).show()


            dialog.dismiss()
        }
        addDialog.setNegativeButton(" Cancel") { dialog, _ ->
            dialog.dismiss()
            Toast.makeText(this, "Insert the data  is cancel", Toast.LENGTH_SHORT).show()

        }
        addDialog.create()
        addDialog.show()
    }

    private fun initFeedRecyclerView() {
        binding.feedrecyclerView1.layoutManager = LinearLayoutManager(this)
        displaySubscriberList()
    }

    private fun displaySubscriberList() {
        subscriberViewModel.subscribers.observe(this) {

            Log.i("MYTAG", it.toString())

            //-------- data binding into recyclerview && onclick option------
            binding.feedrecyclerView1.adapter = MyRecyclerviewAdapter(
                this,
                it
            ) { selectedItem: Subscriber -> listItemClicked(selectedItem) }


        }
    }

    private fun listItemClicked(subscriber: Subscriber) {
//        Toast.makeText(this, "Selected name is ${subscriber.id}", Toast.LENGTH_SHORT).show()
        subscriberViewModel.initUpdateandDelete(subscriber)
        updateInfo(subscriber)
    }

    //--------- update ---------------------------------
    private fun updateInfo(subscriber: Subscriber) {

        val addDialog = AlertDialog.Builder(this)
        val inflter = LayoutInflater.from(this)
        addItemBinding =
            DataBindingUtil.inflate(inflter, R.layout.add_item, null, false)
        addItemBinding.userName.setText(subscriber.name)
        addItemBinding.alertText.setText("Data Update")

        addItemBinding.userName.isEnabled = false

        addDialog.setView(addItemBinding.root)
        addDialog.setPositiveButton("Ok") { dialog, _ ->
            lateinit var check1: String
            lateinit var checkBoole1: String
            val name = addItemBinding.userName.toString()

            if (addItemBinding.simpleCheckBox.isChecked) {
                checkBoole1 = "1"
                check1 = "Live"

            } else {
                checkBoole1 = "0"
                check1 = ""
            }


            val simpleDateFormat = SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")
            val currentDateAndTime: String = simpleDateFormat.format(Date())
            val s: String = currentDateAndTime
            //----------- pass the recyclerview Updating item------------------
            subscriberViewModel.itemUpdate(check1)
            Toast.makeText(this, "Data is Updated Successfully..", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        addDialog.setNegativeButton("Cancel") { dialog, _ ->
            dialog.dismiss()
            Toast.makeText(this, "Update is Cancel", Toast.LENGTH_SHORT).show()

        }
        addDialog.create()
        addDialog.show()
    }
}