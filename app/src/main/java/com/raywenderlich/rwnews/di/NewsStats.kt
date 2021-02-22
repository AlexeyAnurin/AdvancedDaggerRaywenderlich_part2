package com.raywenderlich.rwnews.di
import com.raywenderlich.rwnews.repository.entity.News

const val STATS_LOG = "NEWS_STATS"

interface NewsStats {
    fun printStats(news: News)
}