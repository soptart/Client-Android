package com.artoo.sopt23.artoo_client_android.Adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.artoo.sopt23.artoo_client_android.Data.ThemeData
import com.artoo.sopt23.artoo_client_android.R
import com.artoo.sopt23.artoo_client_android.ThemeActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HomeThemeRecyclerViewAdapter(val dataList: ArrayList<ThemeData>): RecyclerView.Adapter<HomeThemeRecyclerViewAdapter.Holder>(){
    lateinit var ctx: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        ctx = parent.context
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_home_theme, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.title.text = dataList[position].title
        holder.desc.text = dataList[position].desc

        var options: RequestOptions = RequestOptions().centerCrop()

        Glide.with(ctx)
                .load(dataList[position].img_url[0])
                .apply(options)
                .into(holder.img0)

        Glide.with(ctx)
                .load(dataList[position].img_url[1])
                .apply(options)
                .into(holder.img1)
        Glide.with(ctx)
                .load(dataList[position].img_url[2])
                .apply(options)
                .into(holder.img2)
        Glide.with(ctx)
                .load(dataList[position].img_url[3])
                .apply(options)
                .into(holder.img3);
        holder.plus.setOnClickListener {
            val intent: Intent = Intent(ctx, ThemeActivity::class.java)
            ctx.startActivity(intent)
        }
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.txt_rv_item_home_theme_title) as TextView
        val desc: TextView = itemView.findViewById(R.id.txt_rv_item_home_theme_desc) as TextView
        val plus: TextView = itemView.findViewById(R.id.txt_rv_item_home_theme_showall) as TextView
        val img0: ImageView = itemView.findViewById(R.id.img_rv_item_home_theme_0) as ImageView
        val img1: ImageView = itemView.findViewById(R.id.img_rv_item_home_theme_1) as ImageView
        val img2: ImageView = itemView.findViewById(R.id.img_rv_item_home_theme_2) as ImageView
        val img3: ImageView = itemView.findViewById(R.id.img_rv_item_home_theme_3) as ImageView
    }
}