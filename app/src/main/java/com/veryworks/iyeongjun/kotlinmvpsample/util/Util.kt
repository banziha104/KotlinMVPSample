package com.veryworks.iyeongjun.kotlinmvpsample.util

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by iyeongjun on 2018. 2. 6..
 */
fun AppCompatActivity.replace(@IdRes fragmentId: Int, fragment: Fragment, tag : String? =null){
    supportFragmentManager.beginTransaction().replace(fragmentId,fragment,tag).commit();
}
