package com.artoo.sopt23.artoo_client_android.Fragment

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.fragment_dialog_exhibition_check.view.*
import kotlinx.android.synthetic.main.fragment_dialog_exhibition_oops.view.*

class ExhibitionCheckFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view : View = inflater!!.inflate(R.layout.fragment_dialog_exhibition_check, container, false)

        view.btn_exhibition_dialog_check.setOnClickListener {
            onDestroyView()
        }

        return view
    }
}