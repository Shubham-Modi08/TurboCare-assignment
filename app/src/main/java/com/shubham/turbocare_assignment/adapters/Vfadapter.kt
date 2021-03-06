package com.shubham.turbocare_assignment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shubham.turbocare_assignment.R

class Vfadapter(private val list: ArrayList<String>, val listener: MyOnClickListener): RecyclerView.Adapter<Vfadapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var vehicleFuelType = itemView.findViewById<TextView>(R.id.vehicle_fuel_type)
        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                listener.OnClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vehicle_fuel_type,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = list[position]
        holder.apply {
            vehicleFuelType.text = item
        }
    }


    override fun getItemCount(): Int {
        return list.size
    }

    interface MyOnClickListener{
        fun OnClick(position: Int)
    }



}