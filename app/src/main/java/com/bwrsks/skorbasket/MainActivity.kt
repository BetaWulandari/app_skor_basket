package com.bwrsks.skorbasket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var nilaiA : Int = 0
    var nilaiB : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setNilaiA(){

        tv_nilaiA.text = nilaiA.toString()
    }

    fun setNilaiB(){
        tv_nilaiB.text = nilaiB.toString()
    }

    fun add3PointA(view: View){
        this.nilaiA += 3
        setNilaiA()
    }

    fun add2PointA(view: View){
        this.nilaiA += 2
        setNilaiA()
    }

    fun add1PointA(view: View){
        this.nilaiA += 1
        setNilaiA()
    }

    fun add3PointB(view: View){
        this.nilaiB += 3
        setNilaiB()
    }

    fun add2PointB(view: View){
        this.nilaiB += 2
        setNilaiB()
    }

    fun add1PointB(view: View){
        this.nilaiB += 1
        setNilaiB()
    }

    fun clearA(view: View){
        this.nilaiA = 0
        setNilaiA()
    }

    fun clearB(view: View){
        this.nilaiB = 0
        setNilaiB()
    }
}