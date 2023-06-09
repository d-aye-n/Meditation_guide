package com.example.meditationguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.meditationguide.databinding.FragmentStagesListBinding
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.slidingpanelayout.widget.SlidingPaneLayout
import com.example.meditationguide.databinding.ActivityMainBinding

class StagesListFragment: Fragment() {

    class StagesListOnBackPressedCallback(
        private val slidingPaneLayout: SlidingPaneLayout
    ): OnBackPressedCallback(slidingPaneLayout.isSlideable && slidingPaneLayout.isOpen),
    SlidingPaneLayout.PanelSlideListener {



        init {
            slidingPaneLayout.addPanelSlideListener(this)
        }

        override fun handleOnBackPressed() {
            slidingPaneLayout.closePane()
        }

        override fun onPanelSlide(panel: View, slideOffset: Float) {

        }

        override fun onPanelOpened(panel: View) {
            isEnabled = true

        }

        override fun onPanelClosed(panel: View) {
            isEnabled = false
        }
    }

    private val stagesViewModel: StagesViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return FragmentStagesListBinding.inflate(inflater, container,false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentStagesListBinding.bind(view)

        val slidingPaneLayout = binding.slidingPaneLayout
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            StagesListOnBackPressedCallback(slidingPaneLayout)
        )

        slidingPaneLayout.lockMode = SlidingPaneLayout.LOCK_MODE_LOCKED

        val adapter = StagesAdapter {
            stagesViewModel.updateCurrentStage(it)
            binding.slidingPaneLayout.openPane()



        }
        binding.recyclerView.adapter = adapter
        adapter.submitList(stagesViewModel.stagesData)
    }

}
