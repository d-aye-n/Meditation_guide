package com.example.meditationguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import coil.load
import com.example.meditationguide.databinding.FragmentStagesDetailsBinding

class StagesDetailsFragment: Fragment() {

    private val stagesViewModel: StagesViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentStagesDetailsBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentStagesDetailsBinding.bind(view)

        stagesViewModel.currentStage.observe(this.viewLifecycleOwner) {

            binding.apply {
                stagesImageDetail.load(it.stagesImageBanner)
                stageGoalTextholder.text = getString(it.stageGoal)
                skillDetails.text = getString(it.keySkills)
                masteryDetails.text = getString(it.masteryCondition)
            }

        }
    }
}