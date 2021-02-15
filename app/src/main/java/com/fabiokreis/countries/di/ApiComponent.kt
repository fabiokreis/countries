package com.fabiokreis.countries.di

import com.fabiokreis.countries.model.CountriesService
import com.fabiokreis.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}