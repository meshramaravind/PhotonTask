package com.arvind.photontask.domain.usecase

import com.arvind.photontask.data.repository.Repository
import com.arvind.photontask.domain.models.SchoolDataResponse
import com.arvind.photontask.utils.Resource

class GetSchoolDetailsUseCase(private val repository: Repository) {
    suspend operator fun invoke(): Resource<List<SchoolDataResponse>> {
        return repository.getSchoolDetails()
    }
}