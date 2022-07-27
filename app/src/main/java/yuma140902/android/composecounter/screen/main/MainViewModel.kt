package yuma140902.android.composecounter.screen.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    private val mutStateFlow = MutableStateFlow(MainModel.initValue)
    val stateFlow = mutStateFlow.asStateFlow()
    private fun state() = stateFlow.value
    private fun updateState(newState: () -> MainModel) {
        mutStateFlow.value = newState()
    }

    fun onEvent(event: MainEvent) {
        when (event) {
            OnClickCountUpEvent -> countUp()
            OnClickResetEvent -> resetCount()
        }
    }

    private fun countUp() {
        updateState {
            val old = state();
            old.copy(counter = old.counter + 1)
        }
    }

    private fun resetCount() {
        updateState {
            state().copy(counter = 0)
        }
    }
}