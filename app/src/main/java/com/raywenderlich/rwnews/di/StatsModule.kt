package com.raywenderlich.rwnews.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet

@Module
class StatsModule {

    @Provides
    @ElementsIntoSet
    fun provideNewsStats(): Set<NewsStats> {
        return setOf(LengthNewsStats()) }
}