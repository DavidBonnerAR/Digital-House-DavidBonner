package com.example.webservices.data.model


class ResponseModel<T>(
    val info: PageInfoModel,
    val results: List<T>
)