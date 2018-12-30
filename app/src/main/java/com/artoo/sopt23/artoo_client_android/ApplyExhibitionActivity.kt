package com.artoo.sopt23.artoo_client_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.PagerSnapHelper
import com.artoo.sopt23.artoo_client_android.Adapter.ApplyExMyProductAdapter
import com.artoo.sopt23.artoo_client_android.Data.ApplyExMyProductData
import kotlinx.android.synthetic.main.activity_apply_exhibition.*

class ApplyExhibitionActivity : AppCompatActivity() {

    var applyExMyProductAdapter : ApplyExMyProductAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apply_exhibition)

        var snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rv_apply_ex_my_product)

        var dataList: ArrayList<ApplyExMyProductData> = ArrayList()

        var img_url: ArrayList<String> = ArrayList()
        img_url.add("http://webresizer.com/images2/bird1_after.jpg")
        img_url.add("http://img.newspim.com/news/2018/03/31/1803311718414850.jpg")
        img_url.add("http://www.newsa.co.kr/news/photo/201809/187929_146645_3554.jpg")
        img_url.add("https://www.nemopan.com/files/attach/images/2582/269/848/493724be0c020.jpg")

        dataList.add(ApplyExMyProductData(img_url))
        dataList.add(ApplyExMyProductData(img_url))
        dataList.add(ApplyExMyProductData(img_url))
        dataList.add(ApplyExMyProductData(img_url))
        dataList.add(ApplyExMyProductData(img_url))
        dataList.add(ApplyExMyProductData(img_url))

        applyExMyProductAdapter = ApplyExMyProductAdapter(dataList)
        rv_apply_ex_my_product.adapter = applyExMyProductAdapter
        rv_apply_ex_my_product.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)


    }
}
