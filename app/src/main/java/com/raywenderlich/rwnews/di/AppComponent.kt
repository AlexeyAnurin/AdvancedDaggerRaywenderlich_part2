package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.ui.list.NewsListFragment
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, FeatureModule::class])
@Singleton
interface AppComponent {
    fun featureComp(): FeatureComponent
}

