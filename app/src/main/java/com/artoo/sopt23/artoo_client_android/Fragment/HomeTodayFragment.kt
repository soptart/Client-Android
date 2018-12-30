package com.artoo.sopt23.artoo_client_android.Fragment

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import com.artoo.sopt23.artoo_client_android.Adapter.HomeArtistFragmentStatePagerAdapter

import com.artoo.sopt23.artoo_client_android.R
import com.artoo.sopt23.artoo_client_android.R.id.btn_home_first_ticket
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_home_today.*
import kotlinx.android.synthetic.main.fragment_home_today.view.*
import kotlinx.android.synthetic.main.top_navigation_tab_home_artist.*

class HomeTodayFragment : Fragment() {

    lateinit var inflater: LayoutInflater
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        this.inflater = inflater
        val view: View = inflater!!.inflate(R.layout.fragment_home_today, container, false)

        configureTopNavigation(view)
        setOnClickListener(view)

        return view
    }

    private fun configureTopNavigation(view: View) {

        //Artist Tab
        view.vp_top_navi_act_frag_pager_home_artist.adapter = HomeArtistFragmentStatePagerAdapter(childFragmentManager, 5)
        view.tl_top_navi_act_top_menu_home_artist.setupWithViewPager(view.vp_top_navi_act_frag_pager_home_artist)

        val topNaviLayout : View = inflater.inflate(R.layout.top_navigation_tab_home_artist, null, false)
        view.tl_top_navi_act_top_menu_home_artist.getTabAt(4)!!.customView = topNaviLayout.findViewById(R.id.btn_top_navi_fifth_arti_tab) as RelativeLayout
        view.tl_top_navi_act_top_menu_home_artist.getTabAt(3)!!.customView = topNaviLayout.findViewById(R.id.btn_top_navi_fourth_arti_tab) as RelativeLayout
        view.tl_top_navi_act_top_menu_home_artist.getTabAt(2)!!.customView = topNaviLayout.findViewById(R.id.btn_top_navi_third_arti_tab) as RelativeLayout
        view.tl_top_navi_act_top_menu_home_artist.getTabAt(1)!!.customView = topNaviLayout.findViewById(R.id.btn_top_navi_second_arti_tab) as RelativeLayout
        view.tl_top_navi_act_top_menu_home_artist.getTabAt(0)!!.customView = topNaviLayout.findViewById(R.id.btn_top_navi_first_arti_tab) as RelativeLayout
        view.tl_top_navi_act_top_menu_home_artist.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
                selectedArtistTab(position = tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                selectedArtistTab(position = tab!!.position)
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                selectedArtistTab(position = tab!!.position)
            }
        })

    }

    //Artist Tab Layout Setting
    private fun selectedArtistTab(position: Int) {
        if (position == 0) {
            tv_top_navi_first_arti_tab.setTextColor(resources.getColor(R.color.colorEssential))
            tv_top_navi_second_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_third_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_fourth_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_fifth_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
        } else if (position == 1) {
            tv_top_navi_first_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_second_arti_tab.setTextColor(resources.getColor(R.color.colorEssential))
            tv_top_navi_third_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_fourth_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_fifth_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
        } else if (position == 2) {
            tv_top_navi_first_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_second_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_third_arti_tab.setTextColor(resources.getColor(R.color.colorEssential))
            tv_top_navi_fourth_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_fifth_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
        } else if (position == 3) {
            tv_top_navi_first_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_second_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_third_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_fourth_arti_tab.setTextColor(resources.getColor(R.color.colorEssential))
            tv_top_navi_fifth_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
        } else {
            tv_top_navi_first_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_second_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_third_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_fourth_arti_tab.setTextColor(resources.getColor(R.color.colorNonSelectedTab))
            tv_top_navi_fifth_arti_tab.setTextColor(resources.getColor(R.color.colorEssential))
        }
    }

    private fun setOnClickListener(view: View) {
        view.btn_home_first_ticket.setOnClickListener {
            //startActivity:fullImage
        }
        view.btn_home_second_ticket.setOnClickListener {
            //startActivity:fullImage
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        txt_fragment_today_detail_artist.text = "최윤정 작가"
        setRecyclerView(0)
        val snapHelper:LinearSnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv_fragment_home_today_list)
    }

    private fun setTodayView(view:View){
        view.txt_fragment_today_artist0.text = "최윤정"
        view.txt_fragment_today_artist1.text = "이세은"
        view.txt_fragment_today_artist2.text = "윤여진"
        view.txt_fragment_today_artist3.text = "한선민"
        view.txt_fragment_today_artist4.text = "김정음"
        Glide.with(view)
                .load("http://mblogthumb2.phinf.naver.net/MjAxNzA4MTFfODEg/MDAxNTAyNDU5MzM1MjIy.QOa0CMsbB3QKqMHBPgkK-UVHl2P8SXIeqxcz8p_ogSgg.FnoWE1eD8-nROYTatVwgMbXJw52b-B_saXFObmo3KO8g.JPEG.piiin/piiin_%ED%97%A8%ED%82%B4_%EA%B5%AC%EC%8A%AC%EB%AA%A8%EC%95%84%EB%8B%B9%EA%B5%AC%EC%9E%A5_%2872%29.jpg?type=w800")
                .apply(options.override(130,130))
                .into(view.img_fragment_today_artist0)
        Glide.with(view)
                .load("https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703")
                .apply(options.override(130,130))
                .into(view.img_fragment_today_artist1)
        Glide.with(view)
                .load("http://blogimg.ohmynews.com/attach/1475/1386229890.jpg")
                .apply(options.override(130,130))
                .into(view.img_fragment_today_artist2)
        Glide.with(view)
                .load("http://www.geojenews.com/news/photo/201707/43970_30774_1656.jpg")
                .apply(options.override(130,130))
                .into(view.img_fragment_today_artist3)
        Glide.with(view)
                .load("http://img.vogue.co.kr/vogue/2015/04/style_579bbf94e23cc.jpg")
                .apply(options.override(130,130))
                .into(view.img_fragment_today_artist4)

    }

    private fun setOnBtnClickListener(view: View){

        view.img_fragment_today_artist0.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "최윤정 작가"
            setRecyclerView(0)
            view.txt_fragment_today_artist0.setTypeface(null,Typeface.BOLD)
            view.txt_fragment_today_artist0.setTextColor(Color.parseColor("#3b3b3b"))
            view.txt_fragment_today_artist1.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist1.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist2.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist2.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist3.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist3.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist4.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist4.setTextColor(Color.parseColor("#777777"))

            view.img_fragment_today_artist0.setScaleX(1.2f)
            view.img_fragment_today_artist0.setScaleY(1.2f)
            view.img_fragment_today_artist1.setScaleX(1.0f)
            view.img_fragment_today_artist1.setScaleY(1.0f)
            view.img_fragment_today_artist2.setScaleX(1.0f)
            view.img_fragment_today_artist2.setScaleY(1.0f)
            view.img_fragment_today_artist3.setScaleX(1.0f)
            view.img_fragment_today_artist3.setScaleY(1.0f)
            view.img_fragment_today_artist4.setScaleX(1.0f)
            view.img_fragment_today_artist4.setScaleY(1.0f)

            view.img_fragment_today_artist0.setColorFilter(Color.parseColor("#A5ffffff"))
            view.img_fragment_today_artist1.setColorFilter(null)
            view.img_fragment_today_artist2.setColorFilter(null)
            view.img_fragment_today_artist3.setColorFilter(null)
            view.img_fragment_today_artist4.setColorFilter(null)
        }
        view.img_fragment_today_artist1.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "이세은 작가"
            setRecyclerView(1)
            view.txt_fragment_today_artist0.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist0.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist1.setTypeface(null,Typeface.BOLD)
            view.txt_fragment_today_artist1.setTextColor(Color.parseColor("#3b3b3b"))
            view.txt_fragment_today_artist2.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist2.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist3.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist3.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist4.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist4.setTextColor(Color.parseColor("#777777"))

            view.img_fragment_today_artist0.setScaleX(1.0f)
            view.img_fragment_today_artist0.setScaleY(1.0f)
            view.img_fragment_today_artist1.setScaleX(1.2f)
            view.img_fragment_today_artist1.setScaleY(1.2f)
            view.img_fragment_today_artist2.setScaleX(1.0f)
            view.img_fragment_today_artist2.setScaleY(1.0f)
            view.img_fragment_today_artist3.setScaleX(1.0f)
            view.img_fragment_today_artist3.setScaleY(1.0f)
            view.img_fragment_today_artist4.setScaleX(1.0f)
            view.img_fragment_today_artist4.setScaleY(1.0f)

            view.img_fragment_today_artist0.setColorFilter(null)
            view.img_fragment_today_artist1.setColorFilter(Color.parseColor("#A5ffffff"))
            view.img_fragment_today_artist2.setColorFilter(null)
            view.img_fragment_today_artist3.setColorFilter(null)
            view.img_fragment_today_artist4.setColorFilter(null)
        }
        view.img_fragment_today_artist2.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "윤여진 작가"
            setRecyclerView(2)
            view.txt_fragment_today_artist0.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist0.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist1.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist1.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist2.setTypeface(null,Typeface.BOLD)
            view.txt_fragment_today_artist2.setTextColor(Color.parseColor("#3b3b3b"))
            view.txt_fragment_today_artist3.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist3.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist4.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist4.setTextColor(Color.parseColor("#777777"))

            view.img_fragment_today_artist0.setScaleX(1.0f)
            view.img_fragment_today_artist0.setScaleY(1.0f)
            view.img_fragment_today_artist1.setScaleX(1.0f)
            view.img_fragment_today_artist1.setScaleY(1.0f)
            view.img_fragment_today_artist2.setScaleX(1.2f)
            view.img_fragment_today_artist2.setScaleY(1.2f)
            view.img_fragment_today_artist3.setScaleX(1.0f)
            view.img_fragment_today_artist3.setScaleY(1.0f)
            view.img_fragment_today_artist4.setScaleX(1.0f)
            view.img_fragment_today_artist4.setScaleY(1.0f)

            view.img_fragment_today_artist0.setColorFilter(null)
            view.img_fragment_today_artist1.setColorFilter(null)
            view.img_fragment_today_artist2.setColorFilter(Color.parseColor("#A5ffffff"))
            view.img_fragment_today_artist3.setColorFilter(null)
            view.img_fragment_today_artist4.setColorFilter(null)
        }
        view.img_fragment_today_artist3.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "한선민 작가"
            setRecyclerView(3)
            view.txt_fragment_today_artist0.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist0.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist1.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist1.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist2.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist2.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist3.setTypeface(null,Typeface.BOLD)
            view.txt_fragment_today_artist3.setTextColor(Color.parseColor("#3b3b3b"))
            view.txt_fragment_today_artist4.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist4.setTextColor(Color.parseColor("#777777"))

            view.img_fragment_today_artist0.setScaleX(1.0f)
            view.img_fragment_today_artist0.setScaleY(1.0f)
            view.img_fragment_today_artist1.setScaleX(1.0f)
            view.img_fragment_today_artist1.setScaleY(1.0f)
            view.img_fragment_today_artist2.setScaleX(1.0f)
            view.img_fragment_today_artist2.setScaleY(1.0f)
            view.img_fragment_today_artist3.setScaleX(1.2f)
            view.img_fragment_today_artist3.setScaleY(1.2f)
            view.img_fragment_today_artist4.setScaleX(1.0f)
            view.img_fragment_today_artist4.setScaleY(1.0f)

            view.img_fragment_today_artist0.setColorFilter(null)
            view.img_fragment_today_artist1.setColorFilter(null)
            view.img_fragment_today_artist2.setColorFilter(null)
            view.img_fragment_today_artist3.setColorFilter(Color.parseColor("#A5ffffff"))
            view.img_fragment_today_artist4.setColorFilter(null)
        }
        view.img_fragment_today_artist4.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "김정음 작가"
            setRecyclerView(4)
            view.txt_fragment_today_artist0.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist0.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist1.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist1.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist2.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist2.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist3.setTypeface(null,Typeface.NORMAL)
            view.txt_fragment_today_artist3.setTextColor(Color.parseColor("#777777"))
            view.txt_fragment_today_artist4.setTypeface(null,Typeface.BOLD)
            view.txt_fragment_today_artist4.setTextColor(Color.parseColor("#3b3b3b"))

            view.img_fragment_today_artist0.setScaleX(1.0f)
            view.img_fragment_today_artist0.setScaleY(1.0f)
            view.img_fragment_today_artist1.setScaleX(1.0f)
            view.img_fragment_today_artist1.setScaleY(1.0f)
            view.img_fragment_today_artist2.setScaleX(1.0f)
            view.img_fragment_today_artist2.setScaleY(1.0f)
            view.img_fragment_today_artist3.setScaleX(1.0f)
            view.img_fragment_today_artist3.setScaleY(1.0f)
            view.img_fragment_today_artist4.setScaleX(1.2f)
            view.img_fragment_today_artist4.setScaleY(1.2f)

            view.img_fragment_today_artist0.setColorFilter(null)
            view.img_fragment_today_artist1.setColorFilter(null)
            view.img_fragment_today_artist2.setColorFilter(null)
            view.img_fragment_today_artist3.setColorFilter(null)
            view.img_fragment_today_artist4.setColorFilter(Color.parseColor("#A5ffffff"))
        }
    }

    private fun setRecyclerView(pos : Int){
        //초기 화면에 나타나야 하는것
        //누를 때마다 바뀌는 것
        var position = pos
        var dataList: ArrayList<TodayData> = ArrayList()

        if(position==0){
            dataList.add(TodayData("가","2014 作","http://mblogthumb2.phinf.naver.net/MjAxNzA4MTFfODEg/MDAxNTAyNDU5MzM1MjIy.QOa0CMsbB3QKqMHBPgkK-UVHl2P8SXIeqxcz8p_ogSgg.FnoWE1eD8-nROYTatVwgMbXJw52b-B_saXFObmo3KO8g.JPEG.piiin/piiin_%ED%97%A8%ED%82%B4_%EA%B5%AC%EC%8A%AC%EB%AA%A8%EC%95%84%EB%8B%B9%EA%B5%AC%EC%9E%A5_%2872%29.jpg?type=w800"))
            dataList.add(TodayData("나","2015 作","https://t1.daumcdn.net/cfile/tistory/2123603C57CBC13C04"))
            dataList.add(TodayData("다","2016 作","https://post-phinf.pstatic.net/MjAxNzA3MzBfMTEy/MDAxNTAxNDI0ODE2MTA4.dD3p7daah2t4rBTKNBLq5WgSa1Pp-P3JHP7kSnaEymgg.fmuNOwkFqGCcQY6FZ4msM6ZypfBLefzNJ6alJ-hpuNEg.JPEG/228%EC%AA%BD_mylittlesweetsummer%281%29.jpg?type=w1200"))
            dataList.add(TodayData("라","2017 作","https://notefolio.net/data/img/f6/8e/f68e699d1d7c557c33272f81dd764ce5a3649b4ea54a6012bb2c6a98ad9176e8_v1.jpg"))
            dataList.add(TodayData("마","2018 作","https://pbs.twimg.com/media/Dt-r9VrV4AM7Ort.jpg"))
        }
        else if(position==1){
            dataList.add(TodayData("가","2014 作","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
            dataList.add(TodayData("나","2015 作","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
            dataList.add(TodayData("다","2016 作","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
            dataList.add(TodayData("라","2017 作","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
            dataList.add(TodayData("마","2018 作","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
        }
        else if(position==2){
            dataList.add(TodayData("가","2014 作","http://blogimg.ohmynews.com/attach/1475/1386229890.jpg"))
            dataList.add(TodayData("나","2015 作","http://www.safetimes.co.kr/news/photo/201704/34641_11284_3957.jpg"))
            dataList.add(TodayData("다","2016 作","http://dimg.donga.com/wps/NEWS/IMAGE/2018/01/13/88148824.1.jpg"))
            dataList.add(TodayData("라","2017 作","https://i.pinimg.com/originals/1a/6c/14/1a6c14efd0d4202a8cf2a0d9771cc186.jpg"))
            dataList.add(TodayData("마","2018 作","http://cfile235.uf.daum.net/image/132F33405166787F01BB3B"))
        }
        else if(position==3){
            dataList.add(TodayData("가","2014 作","http://www.geojenews.com/news/photo/201707/43970_30774_1656.jpg"))
            dataList.add(TodayData("나","2015 作","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2wrGNnc-79wrlWr_Qz6TjyTH_RhhMGBmMInpwyGCzMf-sw_3b"))
            dataList.add(TodayData("다","2016 作","http://ph.idomin.com/news/photo/200703/213333_167865_1830.jpg"))
            dataList.add(TodayData("라","2017 作","http://www.poemlane.com/image-9/jun24.JPG"))
            dataList.add(TodayData("마","2018 作","http://ph.idomin.com/news/photo/200610/168782-2-138588.jpg"))
        }
        else if(position==4){
            dataList.add(TodayData("가","2014 作","http://img.vogue.co.kr/vogue/2015/04/style_579bbf94e23cc.jpg"))
            dataList.add(TodayData("나","2015 作","http://img.vogue.co.kr/vogue/2015/04/style_579d193814eb1.jpg"))
            dataList.add(TodayData("다","2016 作","https://i.pinimg.com/originals/2f/f2/e2/2ff2e2cf884a51223f26af6a93a546c3.jpg"))
            dataList.add(TodayData("라","2017 作","https://usercontents-c.styleshare.kr/images/17504647/640x-"))
            dataList.add(TodayData("마","2018 作","https://i.pinimg.com/originals/98/a5/14/98a5148af83aa0dcbb1ea4ded7392226.png"))
        }
        else{
            dataList.add(TodayData("가","2014 作","http://mblogthumb2.phinf.naver.net/MjAxNzA4MTFfODEg/MDAxNTAyNDU5MzM1MjIy.QOa0CMsbB3QKqMHBPgkK-UVHl2P8SXIeqxcz8p_ogSgg.FnoWE1eD8-nROYTatVwgMbXJw52b-B_saXFObmo3KO8g.JPEG.piiin/piiin_%ED%97%A8%ED%82%B4_%EA%B5%AC%EC%8A%AC%EB%AA%A8%EC%95%84%EB%8B%B9%EA%B5%AC%EC%9E%A5_%2872%29.jpg?type=w800"))
            dataList.add(TodayData("나","2015 作","https://t1.daumcdn.net/cfile/tistory/2123603C57CBC13C04"))
            dataList.add(TodayData("다","2016 作","https://post-phinf.pstatic.net/MjAxNzA3MzBfMTEy/MDAxNTAxNDI0ODE2MTA4.dD3p7daah2t4rBTKNBLq5WgSa1Pp-P3JHP7kSnaEymgg.fmuNOwkFqGCcQY6FZ4msM6ZypfBLefzNJ6alJ-hpuNEg.JPEG/228%EC%AA%BD_mylittlesweetsummer%281%29.jpg?type=w1200"))
            dataList.add(TodayData("라","2017 作","https://notefolio.net/data/img/f6/8e/f68e699d1d7c557c33272f81dd764ce5a3649b4ea54a6012bb2c6a98ad9176e8_v1.jpg"))
            dataList.add(TodayData("마","2018 作","https://pbs.twimg.com/media/Dt-r9VrV4AM7Ort.jpg"))
        }
        homeTodayRecyclerViewAdapter = HomeTodayRecyclerViewAdapter(activity!!, dataList)
        rv_fragment_home_today_list.adapter = homeTodayRecyclerViewAdapter
        rv_fragment_home_today_list.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL,false)
    }
}