package com.example.navigationcomponenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.fragment.navArgs

class firstfragment : Fragment() {


    val viewModel: FragmentViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_firstfragment,container,false)
       // binding = DataBindingUtil.inflate(inflater, R.layout.fragment_firstfragment, container, false)

        val  button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener { navigateToSecond() }
        return view



    }



    private fun navigateToSecond(){
        val action = firstfragmentDirections.actionFirstfragmentToSecondfragment()
        findNavController().navigate(action)
    }

    private fun submit() {

        val name = viewModel.name
        val password = viewModel.password

        when {
            name.isBlank() -> {
              //  Toast.makeText(this, "Name is mandatory", Toast.LENGTH_SHORT).show()
            }

            password.isBlank() -> {
               // Toast.makeText(this, "password is mandatory", Toast.LENGTH_SHORT).show()
            }
            else -> {

                val user = User(name,password )




            }
        }

    }
}