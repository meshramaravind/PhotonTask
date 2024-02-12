package com.arvind.photontask.data.repository

import com.arvind.photontask.data.remote.SchoolAPI
import com.arvind.photontask.domain.models.SchoolDataResponse
import com.arvind.photontask.domain.repository.RemoteDataSource
import com.arvind.photontask.utils.Resource

class RemoteDataSourceImpl(
    private val schoolAPI: SchoolAPI
) : RemoteDataSource {
    override suspend fun getSchoolData(): Resource<List<SchoolDataResponse>> {
        val response = try {
            schoolAPI.getSchoolData()
        } catch (e: Exception) {
            return Resource.Error("Unknown Error")
        }

        return Resource.Success(response)
    }

}