package com.veryworks.iyeongjun.kotlinmvpsample.data.source.image

import com.veryworks.iyeongjun.kotlinmvpsample.data.ImageData
import com.veryworks.iyeongjun.kotlinmvpsample.util.random

/**
 * Created by iyeongjun on 2018. 2. 17..
 */
class ImageLocalData : ImageDataSource {
    override fun loadImageFileName(imageDataList : (List<ImageData>)-> Unit, size : Int) {
        val list = mutableListOf<ImageData>()
        for (index in 1..size){
            val name = String.format("sample_%02d",(1..10).random() +1)
            list.add(ImageData(name,name))
        }
        imageDataList(list)
    }
}