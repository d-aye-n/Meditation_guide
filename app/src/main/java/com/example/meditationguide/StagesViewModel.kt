package com.example.meditationguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.meditationguide.data.StagesData
import com.example.meditationguide.model.Stage

class StagesViewModel: ViewModel() {

    private var _currentStage: MutableLiveData<Stage> = MutableLiveData<Stage>()
    val currentStage: LiveData<Stage>
        get() = _currentStage

    private var _stagesData: ArrayList<Stage> = ArrayList()
    val stagesData: ArrayList<Stage>
        get() = _stagesData

    init {
        _stagesData = StagesData.getStagesData()
        _currentStage.value = _stagesData[0]
    }

    fun updateCurrentStage(stage: Stage) {
        _currentStage.value = stage
    }
}