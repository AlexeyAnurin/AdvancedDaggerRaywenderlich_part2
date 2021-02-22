package com.raywenderlich.rwnews.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

@Module
class StatsModule {

   /* @Provides
    @ElementsIntoSet
    fun provideNewsStats(): Set<NewsStats> {
        return setOf(LengthNewsStats()) }*/

    @Provides
    @IntoSet
    fun provideNewsStats(): NewsStats {
        return LengthNewsStats() }

}

