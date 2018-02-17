package com.veryworks.iyeongjun.kotlinmvpsample.view.main.home.adapter.holder

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.veryworks.iyeongjun.kotlinmvpsample.R
import kotlinx.android.synthetic.main.itme_image_view.view.*

/**
 * Created by iyeongjun on 2018. 2. 17..
 */

class ImageViewHolder(context: Context, parent : ViewGroup?) : RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.itme_image_view,parent,false)){
    fun onBind(item: String){
        itemView.onBind(item)
    }

    private fun View.onBind(item : String){
        img_view.setImageResource(resources.getIdentifier(item,"drawble",context.packageName))
    }
}