package com.artoo.sopt23.artoo_client_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_mypage_preferences.*

class MypagePreferencesActivity : AppCompatActivity() {
    lateinit var btn_mypage_help : LinearLayout
    lateinit var btn_mypage_artoo_service : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage_preferences)

        val onClick = View.OnClickListener {v: View? ->

            when(v!!.id) {

                R.id.btn_mypage_help -> {
                    val intent = Intent(this, MypageHelpActivity::class.java)
                    startActivity(intent)
                }

                R.id.btn_mypage_artoo_service -> {
                    val intent = Intent(this, MypageServiceActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        btn_mypage_help = findViewById(R.id.btn_mypage_help)
        btn_mypage_help.setOnClickListener(onClick)

        btn_mypage_artoo_service = findViewById(R.id.btn_mypage_artoo_service)
        btn_mypage_artoo_service.setOnClickListener(onClick)
    }

}
