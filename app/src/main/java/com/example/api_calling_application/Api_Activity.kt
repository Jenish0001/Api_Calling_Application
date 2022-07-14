package com.example.api_calling_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.api_calling_application.ApiClient.Companion.getRetrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Api_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api)

        var ok_btn = findViewById<Button>(R.id.ok_btn)
        ok_btn.setOnClickListener {

            getNew("us", "business")
        }
    }

    fun getNew(country: String, category: String) {
        var apiInterface = getRetrofit().create(ApiInterface::class.java)

        apiInterface.getNews(country, category, "9e41272f5ec1439c9a0692b57ca606ba")
            .enqueue(object : Callback<NewModel> {
                override fun onResponse(call: Call<NewModel>, response: Response<NewModel>) {
                    Log.e("TAG", "onResponse: ${response.body()}")
                }

                override fun onFailure(call: Call<NewModel>, t: Throwable) {
                    Log.e("TAG", "onFailure: ${t.message}")
                }
            })

    }
}


