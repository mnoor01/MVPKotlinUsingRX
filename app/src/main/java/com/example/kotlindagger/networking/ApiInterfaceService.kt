package com.example.kotlindagger.networking

import android.database.Observable
import com.example.kotlindagger.model.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterfaceService {
    @GET("albums")
    fun getAlbumList(): Observable<List<Response>>

    companion object Factory {
        fun create(): ApiInterfaceService {
            val retrofit= Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/").build()
            return retrofit.create(ApiInterfaceService::class.java)

        }
    }
}