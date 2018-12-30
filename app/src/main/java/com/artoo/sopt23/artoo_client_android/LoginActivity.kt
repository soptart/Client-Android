package com.artoo.sopt23.artoo_client_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_login.setOnClickListener {

        }
        btn_login_join.setOnClickListener {
            val intent = Intent(this, JoinActivity1::class.java)
            startActivity(intent)
        }
    }
}
