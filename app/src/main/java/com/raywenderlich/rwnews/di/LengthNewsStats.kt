package com.raywenderlich.rwnews.di

import android.util.Log
import com.raywenderlich.rwnews.repository.entity.News

class LengthNewsStats : NewsStats {
    override fun printStats(news: News) {
        Log.i(STATS_LOG, "News Length: ${news.body.length}")
    }
}