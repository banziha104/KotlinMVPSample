package com.veryworks.iyeongjun.kotlinmvpsample.view.main.home.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.veryworks.iyeongjun.kotlinmvpsample.view.main.home.adapter.holder.ImageViewHolder

/**
 * Created by iyeongjun on 2018. 2. 17..
 */
class ImageRecycleradapter(private val context : Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private val list = mutableListOf<>()
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ImageViewHolder(context,parent)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as? ImageViewHolder)?.onBind()
    }
}