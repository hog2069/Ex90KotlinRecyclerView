package com.hog2020.ex90kotlinrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivitry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        //id 의 btn 인 button 에클릭리스너 사용//import kotlinx.android.synthetic.main.activity_intro.*
        btn.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                val intent= Intent(this@IntroActivitry,MainActivity::class.java)
                startActivity(intent)
            }
        })
        }
    }


fun finish() {

}
