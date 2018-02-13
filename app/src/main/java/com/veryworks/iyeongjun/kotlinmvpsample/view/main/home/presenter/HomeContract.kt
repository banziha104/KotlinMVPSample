package com.veryworks.iyeongjun.kotlinmvpsample.view.main.home.presenter

/**
 * Created by iyeongjun on 2018. 2. 13..
 */

interface HomeContract {
    interface View{
        fun showImage(imageName : String)
        fun hideProgress()
        fun showProgress()
    }

    interface Presenter {
        fun loadImage()
    }
}
