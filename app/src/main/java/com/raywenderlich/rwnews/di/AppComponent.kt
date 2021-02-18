package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.ui.list.NewsListFragment
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

  fun inject(frag: NewsListFragment)

  fun inject(frag: NewsDetailFragment)

  /*// 1
  @Component.Factory
  interface Factory {
    // 2
    fun repository(@BindsInstance repo: NewsRepository): AppComponent
  }*/
}
