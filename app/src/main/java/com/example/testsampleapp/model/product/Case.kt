package com.example.testsampleapp.model.product


import com.squareup.moshi.Json

data class Case(
    @Json(name = "bottle_count")
    val bottleCount: Int,
    @Json(name = "discount")
    val discount: Any,
    @Json(name = "id")
    val id: Int,
    @Json(name = "landing_price")
    val landingPrice: Double
)