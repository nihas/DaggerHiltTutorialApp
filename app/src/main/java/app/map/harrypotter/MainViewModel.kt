package app.map.harrypotter

import androidx.lifecycle.ViewModel
import app.map.harrypotter.domain.repository.HarryPotterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: HarryPotterRepository
): ViewModel() {

}