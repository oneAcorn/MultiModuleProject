package com.acorn.modulea

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * Created by acorn on 2019-07-24.
 */
@Route(path = "/module1/Module1MainActivity")
class Module1MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module1_activity_main)
    }
}