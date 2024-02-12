package com.arvind.photontask.viewmodel

import androidx.lifecycle.ViewModel
import com.arvind.photontask.domain.models.SchoolDataResponse
import com.arvind.photontask.domain.usecase.UseCases
import com.arvind.photontask.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class SchoolDetailsViewModel @Inject constructor(
    private val useCases: UseCases
) : ViewModel() {
    suspend fun getSchoolDetails(): Resource<List<SchoolDataResponse>> {
        val result = useCases.getSchoolDetailsUseCase()
        Timber.d(result.data.toString())
        return result
    }
}