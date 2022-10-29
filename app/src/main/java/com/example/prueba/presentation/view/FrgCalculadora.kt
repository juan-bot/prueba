package com.example.prueba.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.example.prueba.R
import com.example.prueba.databinding.FrgCalculadoraBinding
import com.example.prueba.presentation.model.CalculatorVM

class FrgCalculadora : Fragment() {
    private lateinit var binding: FrgCalculadoraBinding
    private var operation = "";
    private val viewModel: CalculatorVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FrgCalculadoraBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.resultado.observe(viewLifecycleOwner){
            binding.tvoperation.setText("$it")
        }
        binding.btnzero.setOnClickListener{
            setOperation('0')
        }
        binding.btnone.setOnClickListener{
            setOperation('1')
        }
        binding.btnone.setOnClickListener{
            setOperation('2')
        }
        binding.btnone.setOnClickListener{
            setOperation('3')
        }
        binding.btnone.setOnClickListener{
            setOperation('4')
        }
        binding.btnone.setOnClickListener{
            setOperation('5')
        }
        binding.btnone.setOnClickListener{
            setOperation('6')
        }
        binding.btnone.setOnClickListener{
            setOperation('7')
        }
        binding.btnone.setOnClickListener{
            setOperation('8')
        }
        binding.btnone.setOnClickListener{
            setOperation('9')
        }
        binding.btnplus.setOnClickListener{
            setOperation('+')
        }
        binding.btndiv.setOnClickListener{
            setOperation('/')
        }
        binding.btnmult.setOnClickListener{
            setOperation('x')
        }
        binding.btnequals.setOnClickListener {
            viewModel.calculaRes("3",'+',"4")
        }
    }
    fun setOperation(character: Char){
        operation+=character
        binding.tvoperation.setText("")
        binding.tvoperation.setText("$operation")
    }
}