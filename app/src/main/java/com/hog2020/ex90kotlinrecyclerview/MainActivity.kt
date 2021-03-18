package com.hog2020.ex90kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //대량의 데이터 property[속성, 멤버변수]
    var items= arrayListOf<Item>() //ArrayList<> 와 동일하게 동작

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //대량의데이터 추가
        items.add(Item("sma","Hello,Ktlin",R.drawable.flag_germany))
        items.add(Item("robin","Hello,Kolin",R.drawable.flag_ghana))
        items.add(Item("lee","Hello,Kotin",R.drawable.flag_italy))
        items.add(Item("fun","Hello,Kotln",R.drawable.flag_nepal))
        items.add(Item("cha","Hello,Kotli",R.drawable.flag_russia))
        items.add(Item("asi","Hello,otlin",R.drawable.flag_usa))

        //리사클러 뷰 안에 이미 아답터 프로피티(멤버변수)가 있어서 아답터 객체를 대입해 주면됨
        recycler.adapter= MyAdapter(this,items)

        //리사이클러뷰에 레이아웃매니저 붙이기
        recycler.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }

    override fun onResume() {
        super.onResume()

        //리사이클러뷰를 갱신하려면 아답터에게 데이터 변경을 공지
        //혹시 아답터가 null 이면 에러가 나기에 그냥 문법적으로 실수할 여지가 없도록
        //특이한 연산자 !! (null 이 아닐떄 실행해- 코드안전성 문법)
        recycler.adapter!!.notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //MenuInflater 를 get 하는 작업 필요없이
        //이미 이액티비티에 멤버변수로 menuInflater 객체가 있음
        menuInflater.inflate(R.menu.option,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.aa->Toast.makeText(this,"aa",Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}