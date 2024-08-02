package app.map.daggerhilt

import androidx.lifecycle.ViewModel
import app.map.daggerhilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {

}