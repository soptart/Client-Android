package com.artoo.sopt23.artoo_client_android

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.system.Os.close
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import com.artoo.sopt23.artoo_client_android.Fragment.ProductUploadAlertFragment
import com.artoo.sopt23.artoo_client_android.Fragment.ProductUploadThemeFragment
import com.artoo.sopt23.artoo_client_android.R.id.btn_product_upload_finish
import kotlinx.android.synthetic.main.activity_product_upload.*
import java.util.ArrayList

class ProductUploadActivity : AppCompatActivity() {

    val themes = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_upload)

        setAlertDialog()
        setViewClickListener()

        var categories = arrayOf("인물", "동물", "식물", "사물", "추상화", "풍경")
        spn_product_upload_category.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)

        var formats = arrayOf("드로잉", "페인팅", "동양화", "혼합매체", "조형/공예", "디지털")
        spn_product_upload_format.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, formats)

        var licenses = arrayOf("1", "2", "3", "4")
        spn_product_upload_license.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, licenses)

        setSpinnerItemSelectedListener()
    }

    private fun setAlertDialog() {
        val alert_dialog = ProductUploadAlertFragment()
        alert_dialog.show(supportFragmentManager, alert_dialog.tag)
    }

    private fun setViewClickListener() {
        btn_product_upload_close.setOnClickListener {
            finish()
        }
        btn_product_upload_open_album.setOnClickListener {

        }
        btn_product_upload_add_theme.setOnClickListener {
            val bottom_sheet_dialog = ProductUploadThemeFragment()
            bottom_sheet_dialog.show(supportFragmentManager, bottom_sheet_dialog.tag)
        }
        btn_product_upload_delivery_parcel.setOnClickListener {

        }
        btn_product_upload_delivery_direct.setOnClickListener {

        }
        btn_product_upload_finish.setOnClickListener {
            finish()
        }
    }

    private fun setSpinnerItemSelectedListener(){

        spn_product_upload_category.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }
        spn_product_upload_format.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }
        spn_product_upload_license.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }
    }

    fun setTagButton() {
        Log.d("ProductUploadActivity:getExtraData", themes[0])
        Log.d("ProductUploadActivity:getExtraData", themes[1])
        Log.d("ProductUploadActivity:getExtraData", themes[2])
        //버튼 연결하면 되는데;;;;
    }

}
