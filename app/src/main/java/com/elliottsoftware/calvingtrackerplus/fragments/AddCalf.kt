package com.elliottsoftware.calvingtrackerplus.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.elliottsoftware.calvingtrackerplus.R



/**
 * A simple [Fragment] subclass.
 * Use the [AddCalf.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddCalf : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_calf, container, false)
    }


}