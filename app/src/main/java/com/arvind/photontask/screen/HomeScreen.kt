package com.arvind.photontask.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.arvind.photontask.domain.models.SchoolDataResponse
import com.arvind.photontask.screen.component.SchoolInfo
import com.arvind.photontask.utils.Resource
import com.arvind.photontask.viewmodel.SchoolDetailsViewModel

@Composable
fun HomeScreen(viewModel: SchoolDetailsViewModel = hiltViewModel()) {
    val details =
        produceState<Resource<List<SchoolDataResponse>>>(initialValue = Resource.Loading()) {
            value = viewModel.getSchoolDetails()
        }.value

    Box(modifier = Modifier.fillMaxSize()) {
        if (details is Resource.Success) {
            SchoolInfo(
                details = details
            )
        } else {
            CircularProgressBar()
        }
    }

}

@Composable
fun CircularProgressBar() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            modifier = Modifier.width(64.dp),
            color = MaterialTheme.colorScheme.secondary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
        )
    }
}
