package com.example.parayo.api

import com.example.parayo.api.request.SignupRequest
import com.example.parayo.api.response.*
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface ParayoApi {

    @GET("/api/v1/hello")
    suspend fun hello(): ApiResponse<String>

    @POST("/api/v1/users")
    suspend fun signup(@Body signupRequest: SignupRequest)
            : ApiResponse<Void>

    companion object {
        val instance = ApiGenerator()
            .generate(ParayoApi::class.java)
    }

}