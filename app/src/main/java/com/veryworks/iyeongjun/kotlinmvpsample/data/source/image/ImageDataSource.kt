package com.veryworks.iyeongjun.kotlinmvpsample.data.source.image

import com.veryworks.iyeongjun.kotlinmvpsample.data.ImageData

/**
 * Created by iyeongjun on 2018. 2. 17..
 */

interface ImageDataSource {
    fun loadImageFileName(imageDataList : (List<ImageData>) -> Unit, size : Int )
}