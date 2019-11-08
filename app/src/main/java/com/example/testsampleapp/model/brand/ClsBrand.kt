package com.example.testsampleapp.model.brand


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
data class ClsBrand(
    @Json(name = "id")
    @field: PrimaryKey
    val id: Int,
    @Json(name = "logo")
    val logo: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "sort_order")
    val sortOrder: Int,
    @Json(name = "type_id")
    val typeId: Int
)