package com.fabiokreis.countries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fabiokreis.countries.model.Country

class ListViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        // mock data
        val mockData = listOf(
                Country("CountryA"),
                Country("CountryB"),
                Country("CountryC"),
                Country("CountryD"),
                Country("CountryE"),
                Country("CountryF")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}