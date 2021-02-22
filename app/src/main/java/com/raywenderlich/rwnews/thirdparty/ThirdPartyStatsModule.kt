package com.raywenderlich.rwnews.thirdparty

import com.raywenderlich.rwnews.di.NewsStats
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class ThirdPartyStatsModule {

    @Provides
    @IntoSet
    fun provideWordsCountNewStats(): NewsStats {
        return WordCountNewsStats()
    }
}