package com.raywenderlich.rwnews.thirdparty

import android.util.Log
import com.raywenderlich.rwnews.di.NewsStats
import com.raywenderlich.rwnews.di.STATS_LOG
import com.raywenderlich.rwnews.repository.entity.News

class WordCountNewsStats : NewsStats {
    override fun printStats(news: News) {
        val wordsCount = news.body.splitToSequence(" ").count()
        Log.i(STATS_LOG, "News Word count: $wordsCount")
    }
}