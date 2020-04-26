package com.icha.tugasmodulsebelas.network

import com.icha.tugasmodulsebelas.BuildConfig.API_KEY
import com.icha.tugasmodulsebelas.BuildConfig.BASE_URL


object TMDBApi {
    fun getMovie(): String{
        return BASE_URL + API_KEY
    }
}