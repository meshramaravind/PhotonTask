package com.arvind.photontask.data.remote

import com.arvind.photontask.domain.models.SchoolDataResponse
import retrofit2.http.GET

interface SchoolAPI {
    @GET("resource/s3k6-pzi2.json")
    suspend fun getSchoolData(): List<SchoolDataResponse>
}