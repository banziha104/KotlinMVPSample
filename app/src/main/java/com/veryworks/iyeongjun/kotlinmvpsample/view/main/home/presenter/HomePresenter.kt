package com.veryworks.iyeongjun.kotlinmvpsample.view.main.home.presenter

import android.os.AsyncTask
import com.veryworks.iyeongjun.kotlinmvpsample.util.random

/**
 * Created by iyeongjun on 2018. 2. 13..
 */
class HomePresenter(val view: HomeContract.View) : HomeContract.Presenter {
    override fun loadImage() {

    }

    inner class ImageAsyncTask : AsyncTask<Unit, Unit, String>() {
        override fun doInBackground(vararg params: Unit?): String {
            Thread.sleep(1000)

            return String.format("sample_%02d", (1..5).random())
        }

        override fun onPreExecute() {
            super.onPreExecute()
            view.showProgress()
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            view.hideProgress()
            result?.let {
                view.showImage(it)
            }
        }
    }

}