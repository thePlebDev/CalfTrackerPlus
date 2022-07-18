package com.elliottsoftware.calvingtrackerplus.recyclerViews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.elliottsoftware.calvingtrackerplus.R
import com.elliottsoftware.calvingtrackerplus.models.Calf

class CalfListAdapter : ListAdapter<Calf,CalfViewHolder>(CalfComparator()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalfViewHolder {

        return CalfViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: CalfViewHolder, position: Int) {
        //THIS IS WHERE WE CALL THE METHOD ON THE VIEWHOLDER TO BIND THE DATA
    }
}


class CalfViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    //private val wordItemView: TextView = itemView.findViewById(R.id.textView)

    fun bind(text: String?) {
        //THIS IS WHERE WE WILL BIND ALL THE DATA
        //wordItemView.text = text
    }

    companion object {
        fun create(parent: ViewGroup): CalfViewHolder {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item, parent, false)
            return CalfViewHolder(view)
        }
    }
}

class CalfComparator : DiffUtil.ItemCallback<Calf>() {
    override fun areItemsTheSame(oldCalf: Calf, newCalf: Calf): Boolean {
        return oldCalf === newCalf
    }

    override fun areContentsTheSame(oldCalf: Calf, newCalf: Calf): Boolean {
        return oldCalf == newCalf
    }
}