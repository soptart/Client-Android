package com.artoo.sopt23.artoo_client_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_product_zoom.*

class ProductZoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_zoom)


        Glide.with(this)
            .load(intent.getStringExtra("img_url"))
            .into(pv_product_zoom_product)
        pv_product_zoom_product
    }
}
