package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button listeners
        bt00.setOnClickListener {}
        bt0.setOnClickListener { appendOnClick(true, "0") }
        bt1.setOnClickListener { appendOnClick(true, "1") }
        bt2.setOnClickListener { appendOnClick(true, "2") }
        bt3.setOnClickListener { appendOnClick(true, "3") }
        bt4.setOnClickListener { appendOnClick(true, "4") }
        bt5.setOnClickListener { appendOnClick(true, "5") }
        bt6.setOnClickListener { appendOnClick(true, "6") }
        bt7.setOnClickListener { appendOnClick(true, "7") }
        bt8.setOnClickListener { appendOnClick(true, "8") }
        bt9.setOnClickListener { appendOnClick(true, "9") }
        btDot.setOnClickListener { appendOnClick(true, ".") }

        btDiv.setOnClickListener { appendOnClick(false, "/") }
        btAdd.setOnClickListener { appendOnClick(false, "+") }
        btMin.setOnClickListener { appendOnClick(false, "-") }
        btMul.setOnClickListener { appendOnClick(false, "*") }
        btRB.setOnClickListener { appendOnClick(false, ")") }
        btLB.setOnClickListener { appendOnClick(false, "(") }
        btEq.setOnClickListener {
          calculate()
        }
        btClr.setOnClickListener { clear() }


    }

    fun appendOnClick(clear: Boolean, string: String) {
        if (clear) {
            tvop.text = ""
            tvip.append(string)
        } else {
            tvip.append(tvop.text)
            tvip.append(string)
            tvop.text = ""
        }
    }

    fun clear() {
        tvip.text = ""
        tvop.text = ""
    }
    fun calculate() {
        try {
            val input=ExpressionBuilder(tvip.text.toString()).build()
            val output=input.evaluate()
            val  longOutput=output.toLong()
            if (output==longOutput.toDouble()){
                tvop.text=longOutput.toString()
            }else{
                tvop.text=output.toString()
            }
        }catch (e:Exception){
            Toast.makeText(this@MainActivity,e.message,Toast.LENGTH_LONG).show()
        }
    }
}



