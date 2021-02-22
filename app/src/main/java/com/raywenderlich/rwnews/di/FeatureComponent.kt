package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.thirdparty.ThirdPartyStatsModule
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import com.raywenderlich.rwnews.ui.list.NewsListFragment
import dagger.Subcomponent

@Subcomponent(modules = [FeatureModule::class, StatsModule::class, ThirdPartyStatsModule::class])
@FeatureScope
interface FeatureComponent {

    fun inject(frag: NewsListFragment)

    fun inject(frag: NewsDetailFragment)
}