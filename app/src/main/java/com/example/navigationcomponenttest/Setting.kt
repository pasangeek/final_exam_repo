package com.example.navigationcomponenttest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.navigationcomponenttest.databinding.FragmentFirstfragmentBinding
import com.example.navigationcomponenttest.databinding.FragmentSettingBinding

class Setting : Fragment() {
    private lateinit var binding: FragmentSettingBinding
    private val setiingViewModel: SettingViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_setting, container, false)


        binding = FragmentSettingBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.lifecycleOwner = this
        binding.settingVM = setiingViewModel




binding.button2.setOnClickListener {

    sharedPref(root.context).saveUsername((setiingViewModel.name))
    Toast.makeText(root.context, "User updated successfully.", Toast.LENGTH_SHORT).show()
    Log.d("LNBTI", "Saved user")
   // sharedPref.saveUsername(data)
}
        return root


    }


}