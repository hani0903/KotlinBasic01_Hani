package com.metacoding.kotlinbasic01_hani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {
            //큰 버튼이 눌렸을 때 할 일
            //  주석 : 코드에 메모 남기기 ->
            //  ctrl + / : 커서가 있는 줄을 주석 처리

            Log.d("메인화면로그", "클릭용 버튼 눌림")
            Log.e("메인화면 로그", "에러 관련 로그")
        }

        smallBtn.setOnClickListener {
            //작은 버튼이 눌렸을 때 할 일
            Toast.makeText(this, "작은 버튼 눌림",Toast.LENGTH_SHORT).show()

        }

    }

}