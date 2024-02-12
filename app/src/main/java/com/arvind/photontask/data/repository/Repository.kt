package com.arvind.photontask.data.repository

import com.arvind.photontask.domain.models.SchoolDataResponse
import com.arvind.photontask.domain.repository.RemoteDataSource
import com.arvind.photontask.utils.Resource
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource
) {
    suspend fun getSchoolDetails(): Resource<List<SchoolDataResponse>> {
        return remote.getSchoolData()
    }
}