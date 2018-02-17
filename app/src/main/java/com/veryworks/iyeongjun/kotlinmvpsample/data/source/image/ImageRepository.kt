package com.veryworks.iyeongjun.kotlinmvpsample.data.source.image

import com.veryworks.iyeongjun.kotlinmvpsample.data.ImageData

/**
 * Created by iyeongjun on 2018. 2. 17..
 */
object ImageRepository : ImageDataSource{
    override fun loadImageFileName(imageDataList: (List<ImageData>) -> Unit, size: Int) {
        imageLocalData.loadImageFileName(imageDataList,size)
    }

    private val imageLocalData : ImageLocalData by lazy {
        ImageLocalData()
    }
}