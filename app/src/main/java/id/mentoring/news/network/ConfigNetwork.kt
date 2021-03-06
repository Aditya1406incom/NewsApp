package id.mentoring.news.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ConfigNetwork {
    companion object {
        fun getRetrofit () : NewsService {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://newsapi.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            return retrofit.create(NewsService::class.java)
        }
    }
}