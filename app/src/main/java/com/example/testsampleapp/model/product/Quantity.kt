package com.example.testsampleapp.model.product


import com.squareup.moshi.Json

data class Quantity(
    @Json(name = "case")
    val case: Case,
    @Json(name = "discount")
    val discount: Any,
    @Json(name = "id")
    val id: Int,
    @Json(name = "landing_price")
    val landingPrice: Double,
    @Json(name = "mrp")
    val mrp: Double,
    @Json(name = "name")
    val name: String,
    @Json(name = "value")
    val value: String
)