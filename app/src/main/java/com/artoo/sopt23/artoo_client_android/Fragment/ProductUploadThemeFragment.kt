package com.artoo.sopt23.artoo_client_android.Fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v4.app.FragmentManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.activity_product_upload.view.*
import kotlinx.android.synthetic.main.fragment_product_upload_theme.*
import kotlinx.android.synthetic.main.fragment_product_upload_theme.view.*

class ProductUploadThemeFragment : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater!!.inflate(R.layout.fragment_product_upload_theme, container, false)

        view.btn_product_upload_theme_antique.setOnClickListener {

        }
        view.btn_product_upload_theme_simple.setOnClickListener {

        }
        view.btn_product_upload_theme_cozy.setOnClickListener {

        }
        view.btn_product_upload_theme_fancy.setOnClickListener {

        }
        view.btn_product_upload_theme_profound.setOnClickListener {

        }
        view.btn_product_upload_theme_cute.setOnClickListener {

        }

        view.btn_product_upload_theme_spring.setOnClickListener {

        }
        view.btn_product_upload_theme_summer.setOnClickListener {

        }
        view.btn_product_upload_theme_fall.setOnClickListener {

        }
        view.btn_product_upload_theme_winter.setOnClickListener {

        }

        view.btn_product_upload_theme_finish.setOnClickListener{
            Log.d("product_upload_theme_frag", "finish_pushed")
            onDestroyView()
        }

        return view
    }

}