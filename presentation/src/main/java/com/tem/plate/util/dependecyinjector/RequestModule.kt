package com.tem.plate.util.dependecyinjector

import com.google.gson.GsonBuilder
import com.tem.data.BuildConfig
import com.tem.data.api.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val requestModule = module {
    single<ApiService> {
        Retrofit.Builder()
            .baseUrl(BuildConfig.API_URL)
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder()
                        .serializeNulls()
                        .create()
                )
            )
            .build().create(ApiService::class.java)
    }
}