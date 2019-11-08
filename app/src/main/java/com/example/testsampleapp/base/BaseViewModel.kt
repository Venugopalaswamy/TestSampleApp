package com.example.testsampleapp.base

import androidx.lifecycle.ViewModel
import com.example.testsampleapp.injection.component.DaggerViewModelInjection
import com.example.testsampleapp.injection.component.ViewModelInjection
import com.example.testsampleapp.injection.module.NetworkModule


abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjection = DaggerViewModelInjection.
        builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when(this){

        }
    }
}