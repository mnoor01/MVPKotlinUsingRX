package com.example.kotlindagger.mvp

import com.example.kotlindagger.model.Response

interface MainContract {
    interface View {
        fun putDataOnRecyclerview(dataItem: List<Response>)

    }
    interface Presenter {
        fun requestDataFromServer()
    }
    interface Interactor{
        interface OnFinishedListener{
            fun onFinished(dataItem: List<Response>)
            fun onFailuer(throwable: Throwable)
        }
    }
}