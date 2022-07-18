package com.elliottsoftware.calvingtrackerplus.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elliottsoftware.calvingtrackerplus.R
import com.elliottsoftware.calvingtrackerplus.databinding.FragmentMainBinding

open class MainFragment: Fragment() {
    private var _binding:FragmentMainBinding? = null;
    private val binding:FragmentMainBinding get(){  return _binding!!};

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentMainBinding.inflate(inflater,container,false);
        val view = binding.root;
        return view;
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}






































