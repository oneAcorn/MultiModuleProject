package com.acorn.module2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * Created by acorn on 2019-07-24.
 */
@Route(path = "/module2/Module2MainActivity")
class Module2MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module2_activity_main)
    }
}