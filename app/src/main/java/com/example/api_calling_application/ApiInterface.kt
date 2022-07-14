package com.example.api_calling_application

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {





//        @GET("everything")
//        fun getNews(@Query("q") c1 :String, @Query("from") from :String, @Query("apiKey") apiKey :String): Call<NewsModel>

        @GET("top-headlines")
        fun getNews(@Query("country") country :String,@Query("category") business :String,@Query("apiKey") apiKey :String):Call<NewModel>






//https://newsapi.org/v2/everything?q=tesla&from=2022-06-06&sortBy=publishedAt&apiKey=9e41272f5ec1439c9a0692b57ca606ba

}