package com.artoo.sopt23.artoo_client_android.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import com.artoo.sopt23.artoo_client_android.Data.ApplyExMyProductData
import com.artoo.sopt23.artoo_client_android.R
import com.bumptech.glide.Glide

class ApplyExMyProductAdapter (val dataList: ArrayList<ApplyExMyProductData>): RecyclerView.Adapter<ApplyExMyProductAdapter.Holder>(){
    lateinit var context: Context
    var mChecked = SparseBooleanArray()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        context = parent.context
        val view: View = LayoutInflater.from(context).inflate(R.layout.rv_item_apply_exhibition_my_product, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        Glide.with(context).load(dataList[position].my_product_img_url).into(holder.my_product_img)
        holder.radid_btn.isChecked = mChecked.get(position)

        holder.radid_btn.setOnClickListener {
            checkBox(position, !mChecked.get(position))
        }


    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val my_product_img : ImageView = itemView.findViewById<View>(R.id.img_ex_my_product) as ImageView
        var radid_btn : RadioButton = itemView.findViewById(R.id.radio_btn_apply_ex)


    }

    fun checkBox (position: Int, value:Boolean) {
        if(value) {
            mChecked.put(position, true)
        }else {
            mChecked.delete(position)
        }
    }

}