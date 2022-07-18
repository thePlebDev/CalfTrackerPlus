package com.elliottsoftware.calvingtrackerplus.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.elliottsoftware.calvingtrackerplus.R
import com.elliottsoftware.calvingtrackerplus.databinding.FragmentMainBinding
import com.elliottsoftware.calvingtrackerplus.recyclerViews.CalfListAdapter

open class MainFragment: Fragment() {
    private var _binding:FragmentMainBinding? = null;
    private val binding:FragmentMainBinding get(){  return _binding!!};


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentMainBinding.inflate(inflater,container,false);
        val view = binding.root;
        return view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = CalfListAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(activity)



        binding.fab.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_addCalf)

        }




    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}






































