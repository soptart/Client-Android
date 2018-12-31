package com.artoo.sopt23.artoo_client_android.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.artoo.sopt23.artoo_client_android.Data.ApplyExhibitionData
import com.artoo.sopt23.artoo_client_android.R


class ApplyExhibitionAdapter(val dataList: ArrayList<ApplyExhibitionData>): RecyclerView.Adapter<ApplyExhibitionAdapter.Holder>(){
    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        context = parent.context
        val view: View = LayoutInflater.from(context).inflate(R.layout.rv_item_apply_exhibition_radio, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.ex_title.text = dataList[position].ex_title
        holder.ex_type.text = dataList[position].ex_type
        holder.ex_desc.text = dataList[position].ex_desc

    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ex_title: TextView = itemView.findViewById(R.id.txt_apply_ex_title) as TextView
        val ex_type: TextView = itemView.findViewById(R.id.txt_apply_ex_type) as TextView
        val ex_desc: TextView = itemView.findViewById(R.id.txt_apply_ex_desc) as TextView

    }

}