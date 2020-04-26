package com.icha.tugasmodulsebelas.main

import com.icha.tugasmodulsebelas.model.Movie

interface MainView{
    fun showMovieList(data: List<Movie>)
}