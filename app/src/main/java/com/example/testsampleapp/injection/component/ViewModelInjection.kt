package com.example.testsampleapp.injection.component

import com.example.testsampleapp.injection.module.NetworkModule
import com.example.testsampleapp.ui.brand_ui.ClsBrandViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjection {

    fun inject(brandViewModel: ClsBrandViewModel)

    @Component.Builder
    interface Builder{
        fun build(): ViewModelInjection
        fun networkModule(networkModule: NetworkModule): Builder
    }
}