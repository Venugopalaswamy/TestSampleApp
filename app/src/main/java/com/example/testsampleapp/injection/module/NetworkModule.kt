package com.example.testsampleapp.injection.module

import com.example.testsampleapp.network.APIInterface
import com.example.testsampleapp.utils.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@Suppress("unused")
object NetworkModule {


    @Provides
    @Reusable
    @JvmStatic
    internal fun provideAPIInterface(retrofit: Retrofit): APIInterface{
        return retrofit.create(APIInterface::class.java)
    }


    @Provides
    @Reusable
    @JvmStatic
    internal fun provideRetrofitInterface(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    }
}