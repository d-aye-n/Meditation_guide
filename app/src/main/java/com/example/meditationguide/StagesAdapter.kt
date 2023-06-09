package com.example.meditationguide

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.meditationguide.databinding.StagesListItemBinding
import com.example.meditationguide.model.Stage


class StagesAdapter(private val onItemClicked: (Stage) -> Unit) :
    ListAdapter<Stage, StagesAdapter.StagesViewHolder>(DiffCallback) {

    private lateinit var context: Context

    class StagesViewHolder(private var binding: StagesListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(stage: Stage, context:Context) {
            binding.title.text = context.getString(stage.titleResourceId)
            binding.mainGoalTextholder.text = context.getString(stage.subTitleResourceId)
            // Load the images into the ImageView using the Coil library.
            binding.stagesImage.load(stage.imageResourceId)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StagesViewHolder {
        context = parent.context
        return StagesViewHolder(
            StagesListItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: StagesViewHolder, position: Int) {
        val current = getItem(position)
        holder.itemView.setOnClickListener {
            onItemClicked(current)
        }
        holder.bind(current, context)
    }

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<Stage>() {
            override fun areItemsTheSame(oldItem: Stage, newItem: Stage): Boolean {
                return (oldItem.id == newItem.id ||
                        oldItem.titleResourceId == newItem.titleResourceId ||
                        oldItem.subTitleResourceId == newItem.subTitleResourceId
                        )
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Stage, newItem: Stage): Boolean {
                return oldItem == newItem
            }
        }
    }




}