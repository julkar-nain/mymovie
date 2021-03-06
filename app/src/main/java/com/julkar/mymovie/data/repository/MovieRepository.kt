package com.julkar.mymovie.data.repository

import com.julkar.mymovie.data.source.local.MovieEntity
import com.julkar.mymovie.domain.ContentType
import com.julkar.mymovie.domain.Movie
import com.julkar.mymovie.domain.MovieDetail

/**
 * @author Julkar Nain
 * since 12/19/20.
 */
interface MovieRepository {
    suspend fun getMovieList(type: ContentType, page: Int): List<Movie>
    suspend fun getMovieDetail(type: ContentType, id: Int): MovieDetail
}