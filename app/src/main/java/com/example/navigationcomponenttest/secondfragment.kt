package com.example.navigationcomponenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs



class secondfragment : Fragment() {

   // private val args:secondfragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_secondfragment, container, false)
        val userNameView = view.findViewById<TextView>(R.id.textSum)
        val SharedPrefUser = sharedPref(view.context).getUsername()
        userNameView.text = SharedPrefUser
        // Inflate the layout for this fragment
        val  button2 = view.findViewById<Button>(R.id.button3)
        button2.setOnClickListener { navigatetoThird() }
        return view



    }
    private fun navigatetoThird(){
       // val action = secondfragmentDirections.actionSecondfragmentToSetting()
        //val navController = findNavController()
        //  findNavController().navigate(R.id.action_firstfragment_to_secondfragment)
      //  findNavController().navigate(action)
        NavHostFragment.findNavController(this).navigate(R.id.action_secondfragment_to_setting)
    }

}