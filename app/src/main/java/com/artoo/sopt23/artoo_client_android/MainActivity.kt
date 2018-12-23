package com.artoo.sopt23.artoo_client_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import com.artoo.sopt23.artoo_client_android.Adapter.MainFragmentStatePagerAdapter
import com.artoo.sopt23.artoo_client_android.R.id.tl_bottom_navi_act_bottom_menu
import com.artoo.sopt23.artoo_client_android.R.id.vp_bottom_navi_act_frag_pager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureBottomNavigation()
    }

    private fun configureBottomNavigation(){
        vp_bottom_navi_act_frag_pager.adapter = MainFragmentStatePagerAdapter(supportFragmentManager, 4) //vp_bottom_navi_act_frag_pager.offscreenPageLimit = 3
// ViewPager와 Tablayout을 엮어줍니다!
        tl_bottom_navi_act_bottom_menu.setupWithViewPager(vp_bottom_navi_act_frag_pager)
//TabLayout에 붙일 layout을 찾아준 다음
        val bottomNaviLayout : View = this.layoutInflater.inflate(R.layout.bottom_navigation_tab, null, false)
//탭 하나하나 TabLayout에 연결시켜줍니다.
        tl_bottom_navi_act_bottom_menu.getTabAt(0)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_home_tab) as RelativeLayout
        tl_bottom_navi_act_bottom_menu.getTabAt(1)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_product_tab) as RelativeLayout
        tl_bottom_navi_act_bottom_menu.getTabAt(2)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_exhibition_tab) as RelativeLayout
        tl_bottom_navi_act_bottom_menu.getTabAt(3)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_mypage_tab) as RelativeLayout
    }
}