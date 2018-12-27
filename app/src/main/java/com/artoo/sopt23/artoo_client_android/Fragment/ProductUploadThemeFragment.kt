package com.artoo.sopt23.artoo_client_android.Fragment

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Message
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v4.app.FragmentManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.artoo.sopt23.artoo_client_android.ProductUploadActivity

import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.activity_product_upload.view.*
import kotlinx.android.synthetic.main.fragment_product_upload_theme.*
import kotlinx.android.synthetic.main.fragment_product_upload_theme.view.*

class ProductUploadThemeFragment : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater!!.inflate(R.layout.fragment_product_upload_theme, container, false)

        val activity: ProductUploadActivity = activity as ProductUploadActivity
        view.btn_product_upload_theme_antique.setOnClickListener {
            activity.themes.add("앤틱한")
        }
        view.btn_product_upload_theme_simple.setOnClickListener {
            activity.themes.add("심플한")
        }
        view.btn_product_upload_theme_cozy.setOnClickListener {
            activity.themes.add("따뜻한")
        }
        view.btn_product_upload_theme_fancy.setOnClickListener {
            activity.themes.add("화려한")
        }
        view.btn_product_upload_theme_profound.setOnClickListener {
            activity.themes.add("심오한")
        }
        view.btn_product_upload_theme_cute.setOnClickListener {
            activity.themes.add("아기자기한")
        }

        view.btn_product_upload_theme_spring.setOnClickListener {
            activity.themes.add("봄")
        }
        view.btn_product_upload_theme_summer.setOnClickListener {
            activity.themes.add("여름")
        }
        view.btn_product_upload_theme_fall.setOnClickListener {
            activity.themes.add("가을")
        }
        view.btn_product_upload_theme_winter.setOnClickListener {
            activity.themes.add("겨울")
       }

        view.btn_product_upload_theme_finish.setOnClickListener{
            activity.setTagButton()
            onDestroyView()
        }

        return view
    }

}