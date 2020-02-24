package com.osakturk.weatherapp.model

import com.google.gson.annotations.SerializedName

open class BaseModel(sCode: String, m: String) {
    @SerializedName("statusCode")
    val statusCode: String = sCode
    @SerializedName("message")
    val message: String = m
}