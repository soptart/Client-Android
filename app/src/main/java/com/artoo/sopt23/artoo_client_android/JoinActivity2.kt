package com.artoo.sopt23.artoo_client_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_join2.*

class JoinActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join2)

        setOnclckListener()
    }

    private fun setOnclckListener() {
        btn_join_next2.setOnClickListener {
            val intent = Intent(this, JoinActivity3::class.java)
            startActivity(intent)
        }
    }
}
