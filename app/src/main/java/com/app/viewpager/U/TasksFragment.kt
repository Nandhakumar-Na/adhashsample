package com.app.viewpager.U

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.viewpager.R
import com.app.viewpager.adapter.ImageAdapter

class TasksFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageAdapter: ImageAdapter

    private val baseImages = listOf(
        R.drawable.glowing,
        R.drawable.ic_audio,
        R.drawable.ic_gallery,
        R.drawable.multi_icon,
        R.drawable.splash_logo,
        R.drawable.ic_empty_box
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tasks, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewTasks)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        val repeatedImages = generateRepeatedImages(baseImages, 50)
        imageAdapter = ImageAdapter(repeatedImages)
        recyclerView.adapter = imageAdapter

        return view
    }

    private fun generateRepeatedImages(images: List<Int>, totalCount: Int): List<Int> {
        val repeatedList = mutableListOf<Int>()
        var i = 0
        while (repeatedList.size < totalCount) {
            repeatedList.add(images[i % images.size])
            i++
        }
        return repeatedList
    }
}
