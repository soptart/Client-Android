package com.artoo.sopt23.artoo_client_android.Adapter

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.artoo.sopt23.artoo_client_android.Data.TodayData
import com.artoo.sopt23.artoo_client_android.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class HomeTodayRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<TodayData>): RecyclerView.Adapter<HomeTodayRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_home_today, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.title.text = dataList[position].title
        holder.year.text = dataList[position].year

        var options: RequestOptions = RequestOptions().transforms(RoundedCorners(50))

        Glide.with(ctx)
                .load(dataList[position].img_url)
                .apply(options)
                .into(holder.img)
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.txt_rv_item_home_today_title) as TextView
        var year : TextView = itemView.findViewById(R.id.txt_rv_item_home_today_year) as TextView
        val img: ImageView = itemView.findViewById(R.id.img_rv_item_home_today_product) as ImageView
    }
}