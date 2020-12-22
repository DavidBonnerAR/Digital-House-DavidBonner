package com.example.webservices.data.api

interface OnResult<T> {
    fun onSucces(result: T)
    fun onFailure()
}