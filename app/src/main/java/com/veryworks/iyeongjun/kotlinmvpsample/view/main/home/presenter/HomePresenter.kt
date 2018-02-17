package com.veryworks.iyeongjun.kotlinmvpsample.view.main.home.presenter

import android.os.AsyncTask
import android.util.Log.v
import com.veryworks.iyeongjun.kotlinmvpsample.data.source.image.ImageRepository
import com.veryworks.iyeongjun.kotlinmvpsample.util.random

/**
 * Created by iyeongjun on 2018. 2. 13..
 */
class HomePresenter(val view: HomeContract.View, val imageRepository : ImageRepository) : HomeContract.Presenter {
    override fun loadImage() {
        ImageAsyncTask(view, imageRepository).execute()
    }

    inner class ImageAsyncTask(val view : HomeContract.View, private val imageRepository: ImageRepository) : AsyncTask<Unit, Unit, Unit>() {
        override fun doInBackground(vararg params: Unit?) {
            Thread.sleep(1000)
        }

        override fun onPreExecute() {
            super.onPreExecute()
            v("home","pre")
            view.showProgress()
        }

        override fun onPostExecute(result: Unit?) {
            super.onPostExecute(result)
            view.hideProgress()
            imageRepository.loadImageFileName {
                view.showImage(it)
            }
        }
    }

}