package com.acorn.sfmultimodule

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.acorn.modulea.Module1MainActivity
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        module1Btn.setOnClickListener {
            startActivity(Intent(this,Module1MainActivity::class.java))
        }
        module2Btn.setOnClickListener {
            ARouter.getInstance().build("/module2/Module2MainActivity").navigation()
        }
    }
}
