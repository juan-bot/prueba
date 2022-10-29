package com.example.prueba.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.prueba.R
import com.example.prueba.databinding.FrgCalculadoraBinding
import com.example.prueba.databinding.FrgMenuFrgBinding

class FrgMenu : Fragment() {
    private lateinit var binding: FrgMenuFrgBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FrgMenuFrgBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btncalculator.setOnClickListener{
            view.findNavController().navigate(R.id.toFrgCalculadora)
        }
    }
}