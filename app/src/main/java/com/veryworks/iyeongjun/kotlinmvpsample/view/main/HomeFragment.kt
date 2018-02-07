package com.veryworks.iyeongjun.kotlinmvpsample.view.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.appcompat.R.id.message
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.veryworks.iyeongjun.kotlinmvpsample.R
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by iyeongjun on 2018. 2. 6..
 */

class HomeFragment : Fragment(){

    companion object {
        val KEY_TITLE = "key-title"
    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater?.inflate(R.layout.fragment_home, container,false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        message.setText(arguments?.getInt(KEY_TITLE) ?:0)
    }

}