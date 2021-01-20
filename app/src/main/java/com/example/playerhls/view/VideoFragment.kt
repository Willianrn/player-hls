package com.example.playerhls.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.playerhls.R
import com.example.playerhls.model.Video
import com.example.playerhls.view.adapter.VideoAdapter

class VideoFragment : Fragment() {

    private val videoAdapter = VideoAdapter(listOf())
    private lateinit var recyclerView: RecyclerView

    fun updateList(list: List<Video>){
        videoAdapter.updateVideoList(list)
        videoAdapter.notifyDataSetChanged()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_video_list, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rv_video_list)
        recyclerView.adapter = videoAdapter
    }


}