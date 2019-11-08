package com.example.testsampleapp.model.product


import com.squareup.moshi.Json

data class Attributes(
    @Json(name = "quantities")
    val quantities: List<Quantity>
)