package com.arvind.photontask.domain.repository

import com.arvind.photontask.domain.models.SchoolDataResponse
import com.arvind.photontask.utils.Resource

interface RemoteDataSource {
    suspend fun getSchoolData(): Resource<List<SchoolDataResponse>>
}