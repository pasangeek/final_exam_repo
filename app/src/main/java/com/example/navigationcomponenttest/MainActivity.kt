package com.example.navigationcomponenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.navigationcomponenttest.R.id.nav_host
import com.example.navigationcomponenttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)
        binding.lifecycleOwner = this

        navController =  findNavController(nav_host)

    }



}