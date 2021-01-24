package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button listeners
        bt00.setOnClickListener{}
        bt0.setOnClickListener {appendOnClick(true,"0")}
        bt1.setOnClickListener {appendOnClick(true,"1")}
        bt2.setOnClickListener {appendOnClick(true,"2")}
        bt3.setOnClickListener {appendOnClick(true,"3")}
        bt4.setOnClickListener {appendOnClick(true,"4")}
        bt5.setOnClickListener {appendOnClick(true,"5")}
        bt6.setOnClickListener {appendOnClick(true,"6")}
        bt7.setOnClickListener {appendOnClick(true,"7")}
        bt8.setOnClickListener {appendOnClick(true,"8")}
        bt9.setOnClickListener {appendOnClick(true,"9")}
        btDot.setOnClickListener {appendOnClick(true,".")}

        btDiv.setOnClickListener {}
        btAdd.setOnClickListener {}
        btMin.setOnClickListener {}
        btMul.setOnClickListener {}
        btRB.setOnClickListener {}
        btLB.setOnClickListener {}
        btEq.setOnClickListener {}
        btClr.setOnClickListener {}

        fun appendOnClick(clear:Boolean,string:String){
            if(clear){
                tvip.text=""
                tvip.append(string)
            }else{
                tvip.append(tvop.text)
                tvip.append(string)
                tvop.text=""
            }
        }
    }
}
