package com.example.consumodeapipartei.models

data class ApiResponseModel<T> (
    val info: PageInfoModel,
    val results: List<T>
)