package com.example.yemektarifleri

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yemektarifleri.databinding.FragmentListeBinding


class ListeFragment : Fragment() {
    lateinit var binding: FragmentListeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListeBinding.inflate(layoutInflater)
        return binding.root


    }


}