package com.veryworks.iyeongjun.kotlinmvpsample.view.main.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.appcompat.R.id.message
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.veryworks.iyeongjun.kotlinmvpsample.R
import com.veryworks.iyeongjun.kotlinmvpsample.view.main.home.presenter.HomeContract
import com.veryworks.iyeongjun.kotlinmvpsample.view.main.home.presenter.HomePresenter
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by iyeongjun on 2018. 2. 6..
 */

class HomeFragment : Fragment(), HomeContract.View{
    private val homePresenter : HomePresenter by lazy {
        HomePresenter(this)
    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater?.inflate(R.layout.fragment_home, container,false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun showImage(imageName: String) {
        imageView.setImageResource(resources.getIdentifier(imageName, "drawble",context.packageName))
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}