package com.example.jjol.network

import com.example.jjol.model.SignInRequest
import com.example.jjol.model.SignInResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {

    @POST("$user_service/login")
    fun signIn(
        @Body signInRequest: SignInRequest
    ): Call<SignInResponse>

    companion object {
        const val user_service = "user-service"
    }
}