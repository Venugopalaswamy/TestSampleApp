package com.example.testsampleapp.network

import android.database.Observable
import com.example.testsampleapp.model.brand.ClsBrand
import com.example.testsampleapp.model.product.ClsProduct
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {

    @GET("v3/brand")
    fun getAllBrands(@Query("brand_type_id") brand_type_id:Int,@Query("start_limit") start_limit:Int,@Query("end_limit") end_limit:Int)
            : Call<List<ClsBrand>>

    @GET("v2/seller_product")
    fun getProductsBasedOnBrand(@Query("brand_id") brand_id:Int,@Query("start_limit") start_limit:Int,@Query("end_limit") end_limit:Int)
    :Call<List<ClsProduct>>

}