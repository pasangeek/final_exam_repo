package com.example.navigationcomponenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponenttest.databinding.FragmentFirstfragmentBinding
import com.example.navigationcomponenttest.ViewModel

class firstfragment : Fragment() {

    private lateinit var binding: FragmentFirstfragmentBinding
    private val viewModel: ViewModel by viewModels()
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        binding = FragmentFirstfragmentBinding.inflate(inflater,container,false)
      val root :View = binding.root
        binding.lifecycleOwner = this
 binding.vm = viewModel



       binding.button.setOnClickListener {
         //  navigateToSecond()
        login()

          // val name = viewModel.name
          // val password = viewModel .password


       }
        return root



    }



    private fun navigateToSecond(){
        NavHostFragment.findNavController(this).navigate(R.id.action_firstfragment_to_secondfragment)
    }

    private fun login() {

        val name = viewModel.name
        val password = viewModel.password

 //if (name=="admin"&& password =="password") navigateToSecond()

       when {
            name.isBlank() -> {
              Toast.makeText(context, "Name is mandatory", Toast.LENGTH_SHORT).show()
            }

            password.isBlank() -> {
               Toast.makeText(context, "password is mandatory", Toast.LENGTH_SHORT).show()
            }



            else -> {

           //  val user = User(name,password )

            if ( name == "user" || password == "password"){

               navigateToSecond()
            }
               else {

                Toast.makeText(context, "Invalid Credentials", Toast.LENGTH_SHORT).show()
               }


            }
        }

    }
}