package com.artoo.sopt23.artoo_client_android.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.artoo.sopt23.artoo_client_android.Adapter.HomeThemeRecyclerViewAdapter
import com.artoo.sopt23.artoo_client_android.Data.ThemeData

import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.fragment_home_theme.*
import kotlinx.android.synthetic.main.rv_item_home_theme.*
import kotlin.collections.ArrayList

class HomeThemeFragment : Fragment() {
    lateinit var homeThemeRecyclerViewAdapter: HomeThemeRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home_theme, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //setRecyclerView()
    }


    /*private fun setRecyclerView() {
        var dataList: ArrayList<ThemeData> = ArrayList()

        var img_url: ArrayList<String> = ArrayList()
        img_url.add("http://webresizer.com/images2/bird1_after.jpg")
        img_url.add("http://img.newspim.com/news/2018/03/31/1803311718414850.jpg")
        img_url.add("http://www.newsa.co.kr/news/photo/201809/187929_146645_3554.jpg")
        img_url.add("https://www.nemopan.com/files/attach/images/2582/269/848/493724be0c020.jpg")

        dataList.add(ThemeData("# 거실에 걸어두면 예쁠 것 같아!", "허전했던 벽에 한번 걸어보자", img_url))
        dataList.add(ThemeData("# 카페에 거는 순간 감성카페로 등극!", "카페 분위기에 어울리는 그림을 찾아보자", img_url))

        homeThemeRecyclerViewAdapter = HomeThemeRecyclerViewAdapter(dataList)
        rv_fragment_theme_list.adapter = homeThemeRecyclerViewAdapter
        rv_fragment_theme_list.layoutManager = LinearLayoutManager(activity)
    }*/
}
